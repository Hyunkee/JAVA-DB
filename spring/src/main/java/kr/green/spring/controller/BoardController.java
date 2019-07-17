package kr.green.spring.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.green.spring.dao.BoardMapper;
import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;
import kr.green.spring.service.BoardService;
import kr.green.spring.service.MemberService;
import kr.green.spring.vo.BoardVO;

@Controller // 컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식 ,  없을땐 하나의 클래스로 인식한다.
@RequestMapping(value="/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService boardService;
	@Autowired
	MemberService memberSerivce;
	@Autowired
	BoardMapper boardMapper;
	
	/*
	 * @RequestMapping(value="/list", method=RequestMethod.GET) public String
	 * boardListGet(Model model) { //logger.info("게시판페이지 실행"); ArrayList<BoardVO>
	 * boardList = boardService.getBoardList(); for(BoardVO tmp:boardList) {
	 * 
	 * } model.addAttribute("list", boardList); return "board/list"; }
	 */
	
	@RequestMapping(value="/display", method=RequestMethod.GET)	
	public String boardDisplayGet(Model model, Integer num) {
		boardService.updateViews(num);
		BoardVO bVo = boardService.getBoard(num);
		System.out.println(bVo.getWriter());
		model.addAttribute("board",bVo);		
		return "/board/display";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String displayModifyGet(Model model, Integer num,HttpServletRequest r) {
		//logger.info("게시판수정 실행");
		BoardVO bVo = boardService.getBoard(num);
		if(boardService.isWriter(num, r)) {
			model.addAttribute("board",bVo);
			return "/board/modify";
		}		
		return "redirect:/board/list";
		
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String displayModifyPost(BoardVO tmp) {
		//logger.info("게시판수정 진행");
		
		boardService.modify(tmp);		
		return "redirect:/board/list";
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String displayDeleteGet(BoardVO boardVO, HttpServletRequest r,Integer num) {
		//logger.info("게시판삭제 실행");		
		//System.out.println(boardVO);
		if(boardService.isWriter(num, r)) {
			boardService.delete(boardVO);
			return "redirect:/board/list";
		}		
		return "redirect:/board/list";
	}
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String displayInsertGet() {
		//logger.info("게시판등록 실행");		
		return "/board/insert";
	}
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String displayInsertPost(BoardVO boardVO) {
		//logger.info("게시판등록 진행중");		
		boardService.insert(boardVO);
		return "redirect:/board/list";
	}
	@RequestMapping(value="/list")	
	public String boardList(Model model, Criteria cri) {
		logger.info("페이징");
	    int totalCount = boardMapper.countBoard(cri);
	    cri.setPerPageNum(5);
	    PageMaker pageMaker = new PageMaker();
	    //pageMaker의 displayPageNum 설정
	    pageMaker.setDisplayPageNum(2);
	    //pageMaker의 현재 페이지 정보 설정
	    pageMaker.setCriteria(cri);
	    //pageMakek의 총 게시글 수 설정
	    pageMaker.setTotalCount(totalCount);
	    System.out.println(cri);
	    ArrayList<BoardVO> list 
	        =  (ArrayList<BoardVO>)boardMapper.listPage(pageMaker.getCriteria());
	    
	    model.addAttribute("list",list);
	    model.addAttribute("pageMaker", pageMaker);
	    return "/board/list";
	}
}
