package kr.green.spring.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	
	
	
	// 서버 부분을 제외한 URL이 "/" 이고, 방식이 GET이면 home 메소드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		//logger.info("회원가입페이지 실행"); // 서버기록 관리하는 함수	
		
		return "home";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signupGet(Model model) {
		//logger.info("회원가입페이지 실행"); // 서버기록 관리하는 함수		
		
		//회원가입 진행되어야 함
		
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signupPost(MemberVO mVo) {
		//logger.info("회원가입 진행중"); // 서버기록 관리하는 함수		
		
		//회원가입 진행되어야 함
		if(memberService.signup(mVo))
			return "redirect:/";
		else {
			return "redirect:/signup";
		}
		
	}
	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signinGet(Model model) {
		//logger.info("로그인페이지 실행"); // 서버기록 관리하는 함수		
		
		
		return "signin";
	}
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String signinPost(Model model, MemberVO mVo) {
		//logger.info("로그인 진행중"); // 서버기록 관리하는 함수		
		System.out.println(mVo);
		//회원가입 진행되어야 함
		MemberVO user = memberService.signin(mVo);
		if(user != null) {
			model.addAttribute("user",user);
			return "redirect:/member";
		}
		return "redirect:/signin";		
	}
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String memberGet(Model model) {
		//logger.info("회원정보페이지 실행"); // 서버기록 관리하는 함수		
		
		
		return "member";
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.GET)
	public String memberModifyGet(Model model) {
		//logger.info("회원정보 수정페이지 실행"); // 서버기록 관리하는 함수		
		
		
		return "member/modify";
	}
	@RequestMapping(value = "/member/modify", method = RequestMethod.POST)
	public String memberModifyPost(Model model, MemberVO mVo, String oldPw) {
		//logger.info("회원정보 수정페이지 진행중"); // 서버기록 관리하는 함수		
		
		
		if(memberService.modify(mVo,oldPw))
			return "redirect:/";
		else {
			return "redirect:/member/modify";
		}
	}
	@RequestMapping(value = "/signout") //로그아웃 기능
	public String signout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "redirect:/";
	}
	@RequestMapping(value ="/dup")
	@ResponseBody
	public Map<Object, Object> idcheck(@RequestBody String id){

	    Map<Object, Object> map = new HashMap<Object, Object>();
	    // 변수 id에 저장된 아이디가 회원 아이디인지 아닌지 확인하여 isMember변수에 담아 보낸다.
	    boolean isMember = memberService.isMember(id);
	    map.put("isMember",isMember);	    
	    
	    return map;
	}
	@RequestMapping(value = "/mail/mailForm")
	public String mailForm() {

	    return "mail";
	}  

	// mailSending 코드
	@RequestMapping(value = "/mail/mailSending")
	public String mailSending(HttpServletRequest request) {

	    String setfrom = "stajun@naver.com";         
	    String tomail  = request.getParameter("tomail");     // 받는 사람 이메일
	    String title   = request.getParameter("title");      // 제목
	    String content   = request.getParameter("content");
	    memberService.sendMail(tomail, title, content);
	    

	    return "redirect:/mail/mailForm";
	}
	
	@RequestMapping(value = "password/find", method = RequestMethod.GET)
	public String passwordFindGet() {		
		return "member/find";
	}
	
	// 아이디와 이메일체크 
	@RequestMapping(value ="/checkemail")
	@ResponseBody
	public Map<Object, Object> emailcheck(@RequestBody String str){

	    Map<Object, Object> map = new HashMap<Object, Object>();
	    // 변수 id에 저장된 아이디가 회원 아이디인지 아닌지 확인하여 isMember변수에 담아 보낸다.
	    
	    String [] arr = str.split("&");
	    String id = arr[0];
	    String email = "";	    
	    try {
			email = URLDecoder.decode(arr[1], "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}	    	    
	    id = memberService.getVal(id);
	    email = memberService.getVal(email);
	    
	    boolean isOk = memberService.checkMember(id,email);
	    map.put("isOk", isOk);
	    return map;
	}
	// 임시 비밀번호 메일로 발송
	@RequestMapping(value = "/password/send")
	public String passwordSend(String email,String id) {
		//비밀번호 생성
		String newPw = memberService.createPw();
		//생성된 비밀번호 DB에 저장
		memberService.modify(id, email, newPw);
		//이메일 발송
		String title = "변경된 비밀번호입니다.";
		String contents = "변경된 비밀번호입니다.\n"+newPw+"\n";
		memberService.sendMail(email,title,contents);
	    return "send";
	}  
}
