package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.library.mdct.dao.BorrowerDAO;
import com.library.mdct.dto.BorrowerVO;

@Service
public class BorrowerServiceImpl implements BorrowerService{

	@Inject
	BorrowerDAO borrowerDAO;
	
	@Override
	public BorrowerVO borrowerSearch(String borNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BorrowerVO> borrowerList() throws Exception {
		return borrowerDAO.borrowerList();
	}

	@Override
	public void borrowerInsert(BorrowerVO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrowerUpdate(Map<String, String> map) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrowerDelete(String borNo) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
