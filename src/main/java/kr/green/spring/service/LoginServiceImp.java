package kr.green.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.MemberDAO;
import kr.green.spring.vo.MemberVO;

@Service
public class LoginServiceImp implements LoginService {
	
	@Autowired
	MemberDAO memberDao;
	
	@Override
	public boolean signin(MemberVO mVo) {
		// 아이디와 비밀번호를 쓰고나서 로그인을 했을 시 db에있는 아이디와 비밀번호를 비교하여 맞을시에 로그인 성공(true), 실패(false)		
			
		if(memberDao.getMember(mVo.getId()).equals(mVo))
			return true;
		
		
		return true;
	}
	
}
