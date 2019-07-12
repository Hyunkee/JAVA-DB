package kr.green.spring.service;

import java.util.ArrayList;

import kr.green.spring.vo.BoardVO;

public interface BoardService {

	ArrayList<BoardVO> getBoardList();

	BoardVO getBoard(Integer num);

	void updateViews(Integer num);

	public boolean modify(BoardVO bVo);

	ArrayList<BoardVO> delete();

	
	
	

}
