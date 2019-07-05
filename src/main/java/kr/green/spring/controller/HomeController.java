package kr.green.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.service.LoginService;
import kr.green.spring.service.MemberService;
import kr.green.spring.vo.MemberVO;



/**
 * Handles requests for the application home page.
 */
@Controller // 컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식 ,  없을땐 하나의 클래스로 인식한다.
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	LoginService loginService;
	
	
	// 서버 부분을 제외한 URL이 "/" 이고, 방식이 GET이면 home 메소드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("회원가입페이지 실행"); // 서버기록 관리하는 함수		
		
		
		return "home";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet(Model model) {
		logger.info("회원가입페이지 실행"); // 서버기록 관리하는 함수		
		
		//회원가입 진행되어야 함
		
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(MemberVO mVo) {
		logger.info("회원가입 진행중"); // 서버기록 관리하는 함수		
		
		//회원가입 진행되어야 함
		if(memberService.signup(mVo))
			return "redirect:/";
		else {
			return "redirect:/signup";
		}
		
	}
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinGet(Model model) {
		logger.info("로그인페이지 실행"); // 서버기록 관리하는 함수		
		
		
		return "signin";
	}
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signinPost(Model model, MemberVO mVo) {
		logger.info("로그인 진행중"); // 서버기록 관리하는 함수		
		System.out.println(mVo);
		//회원가입 진행되어야 함
		if(memberService.signin(mVo))
			return "redirect:/member";
		else {
			return "redirect:/signin";
		}
		
	}
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String memberGet(Model model) {
		logger.info("회원정보페이지 실행"); // 서버기록 관리하는 함수		
		
		
		return "member";
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.GET)
	public String memberModifyGet(Model model) {
		logger.info("회원정보 수정페이지 실행"); // 서버기록 관리하는 함수		
		
		
		return "member/modify";
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.POST)
	public String memberModifyPost(Model model, MemberVO mVo, String oldPw) {
		logger.info("회원정보 수정페이지 진행중"); // 서버기록 관리하는 함수		
		System.out.println(mVo);
		System.out.println(oldPw);
		
		if(memberService.modify(mVo,oldPw))
			return "redirect:/";
		else {
			return "redirect:/member/modify";
		}
	}
}
