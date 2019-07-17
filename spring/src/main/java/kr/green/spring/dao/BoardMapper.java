package kr.green.spring.dao;

import java.util.List;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.vo.BoardVO;

public interface BoardMapper {
	public List<BoardVO> listPage(Criteria cri); 
    public int countBoard(Criteria cri);
}
