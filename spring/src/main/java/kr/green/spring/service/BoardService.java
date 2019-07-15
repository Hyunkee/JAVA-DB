package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(Integer num);

	void updateViews(Integer num);

	public boolean modify(BoardVO bVo);	

	public void insert(BoardVO boardVO);

	public void delete(BoardVO boardVO);

	boolean isWriter(Integer num, HttpServletRequest r);

	

	

	
	
	

}
