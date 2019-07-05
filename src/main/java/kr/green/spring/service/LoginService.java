package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.vo.MemberVO;

public interface LoginService {
	public boolean signin(MemberVO mVo); 
}
