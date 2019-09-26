package kr.green.spring.service;

import org.springframework.stereotype.Service;

import kr.green.spring.pagination.Criteria;
import kr.green.spring.pagination.PageMaker;

@Service
public class PageMakerServiceImp implements PageMakerService {

	@Override
	public PageMaker getPageMaker(int displayPageNum, Criteria cri, int totalCount) {
		PageMaker pageMaker = new PageMaker();	    
	    pageMaker.setDisplayPageNum(displayPageNum);	
	    pageMaker.setCriteria(cri);	 	    
	    pageMaker.setTotalCount(totalCount);
		return pageMaker;
	}

}
