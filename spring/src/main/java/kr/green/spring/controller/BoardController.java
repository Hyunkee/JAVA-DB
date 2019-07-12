package kr.green.spring.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.green.spring.service.BoardService;
import kr.green.spring.vo.BoardVO;

@Controller // 컨트롤러 어노테이션으로 @Controller가 붙으면 컨트롤러로 인식 ,  없을땐 하나의 클래스로 인식한다.
@RequestMapping(value="/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	BoardService boardService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)	
	public String boardListGet(Model model) {
		logger.info("게시판페이지 실행");
		ArrayList<BoardVO> boardList = boardService.getBoardList();
		for(BoardVO tmp:boardList) {
			System.out.println(tmp);
		}
		model.addAttribute("list", boardList);
		return "board/list";
	}
	
	@RequestMapping(value="/display", method=RequestMethod.GET)	
	public String boardDisplayGet(Model model, Integer num) {
		logger.info("게시판화면 실행");
		//조회수 증가
		boardService.updateViews(num);
		BoardVO bVo = boardService.getBoard(num);
		model.addAttribute("board",bVo);		
		return "/board/display";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String displayModifyGet(Model model, Integer num) {
		logger.info("게시판수정 실행");
		BoardVO bVo = boardService.getBoard(num);
		model.addAttribute("board",bVo);
		return "/board/modify";
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String displayModifyPost(BoardVO tmp) {
		logger.info("게시판수정 진행");
		System.out.println(tmp);
		boardService.modify(tmp);		
		return "redirect:/board/list";
	}
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String displayDeleteGet() {
		logger.info("게시판삭제 실행");		
		return "/board/delete";
	}
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String displayDeletePost() {
		logger.info("게시판삭제 진행");		
		return "board";
	}
}
