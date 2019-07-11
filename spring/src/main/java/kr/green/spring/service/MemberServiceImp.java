package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {
	
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean signup(MemberVO mVo) {
		// 기존에 해당 아이디가 있는지 체크
		// 있으면 false 반환하고 종료
		// 없으면 회원가입 진행
		if(mVo == null)
			return false;
		mVo.setName("");
			
		if(memberDao.getMember(mVo.getId()) != null)
			return false;
		memberDao.signup(mVo);
		return true;
	}

	@Override
	public MemberVO signin(MemberVO mVo) {
		if(mVo == null)
			return null; // 예외처리
		MemberVO oVo = memberDao.getMember(mVo.getId()); //dao에게 id와 일치하는 회원 정보를 가져오게 시키고 저장한 후,
		if(oVo == null)			
			return null; // 가져오게 시키고 저장한 후, 저장된 회원 정보가 없으면(null) 컨트롤러에게 회원 아니라고 알려주고
		if(oVo.getPw().equals(mVo.getPw()))		
			return oVo;//있으면 가져온 회원정보 비밀번호와 입력한
						//회원정보 비밀번호를 비교하여 같으면 컨트롤러에게 회원이라고 알려주고, 다르면 아니라고 알려준다.		
		return null;
	}

	@Override
	public boolean modify(MemberVO mVo, String oldPw) {
		if(mVo == null)
			return false;
		if(memberDao.getMember(mVo.getId()).getPw().equals(oldPw)) {
			memberDao.modify(mVo);
			return true;
		}
		return false;
	}
	
}
