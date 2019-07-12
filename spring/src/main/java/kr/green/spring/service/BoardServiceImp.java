package kr.green.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.vo.BoardVO;

@Service
public class BoardServiceImp implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public ArrayList<BoardVO> getBoardList() {
		return boardDao.getBoardList();
	}

	@Override
	public BoardVO getBoard(Integer num) {
		if(num == null)
			return null;
		return boardDao.getBoard(num);
	}

	@Override
	public void updateViews(Integer num) {
		//boardDao.updateViews(num);
		BoardVO tmp = boardDao.getBoard(num);
		if(tmp != null) {
			int oldView = tmp.getViews();
			tmp.setViews(oldView+1);
			boardDao.updateBoard(tmp);
		} 
		
	}

	@Override
	public boolean modify(BoardVO tmp) {
		if(tmp == null)
			return false;		
		boardDao.updateBoard(tmp);
		return true;		
	}

	@Override
	public ArrayList<BoardVO> delete() {		
		return boardDao.deleteBoard();
	}

	
}
