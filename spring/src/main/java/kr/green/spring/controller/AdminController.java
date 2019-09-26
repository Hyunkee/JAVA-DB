package kr.green.spring.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.MemberService;
import kr.green.spring.service.PageMakerService;
import kr.green.spring.vo.MemberVO;



@Controller
@RequestMapping(value="/admin")
public class AdminController {
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);	
	
	@Autowired
	MemberService memberService;
	@Autowired
	PageMakerService pageMakerService;
	
	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public String adminUserListGet(Model model,Criteria cri) {
		logger.info("회원정보 페이지");
		cri.setPerPageNum(5);
		// 리스트를 현재 페이지 정보를 기준으로 가져와야함
		ArrayList<MemberVO> list = memberService.getAllMember(cri);
		//totalCount를 db에서 검색해서 가져와야함.
		int totalCount = memberService.getTotalCount();
		//jsp에서 페이지네이션 링크를 board가 아닌 admin/user/list로 수정해야함
		PageMaker pageMaker = pageMakerService.getPageMaker(5, cri, totalCount);
	    		
		model.addAttribute("list",list);
		model.addAttribute("pageMaker",pageMaker);		
		
		return "admin/user/list";
	}
	@RequestMapping(value = "/user/authority")
	public String adminUserAuthority(MemberVO mVo,Model model,Criteria cri) {
		logger.info("회원등급 수정");
		System.out.println(mVo);
		memberService.updateAuthority(mVo);
		model.addAttribute("cri", cri);
		return "redirect:/admin/user/list";
	}
}
