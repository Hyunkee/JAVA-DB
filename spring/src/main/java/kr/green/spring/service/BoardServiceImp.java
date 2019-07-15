package kr.green.spring.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.green.spring.dao.BoardDAO;
import kr.green.spring.vo.BoardVO;
import kr.green.spring.vo.MemberVO;

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
	public void insert(BoardVO boardVO) {		
		boardDao.insertBoard(boardVO);		
	}

	@Override
	public void delete(BoardVO boardVO) {
		
		boardDao.deleteBoard(boardVO);		
	}

	@Override
	public boolean isWriter(Integer num, HttpServletRequest r) {
		MemberVO user = (MemberVO)r.getSession().getAttribute("user");
		BoardVO bVo = boardDao.getBoard(num);
		if(bVo == null || user == null) {
			return false;
		}
		if(bVo.getWriter() != null && bVo.getWriter().equals(user.getId())) {
			return true;
		}
		return false;
	}

}
