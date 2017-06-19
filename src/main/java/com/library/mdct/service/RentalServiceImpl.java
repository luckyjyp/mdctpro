package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.library.mdct.dao.LibraryDAO;

@Service
public class RentalServiceImpl implements LibraryService {
	
	
	@Resource(name="rentalDAOImpl")
	private LibraryDAO libraryDAO;
	
	/*@Inject
	LibraryDAO libraryDAO;*/
	
	@Override
	public List<? extends Object> searchList() throws Exception {
		return null;
	}

	@Override
	public Object oneSearch(String obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Map<String, String> map) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Map<String, String> map) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String obj) throws Exception {
		// TODO Auto-generated method stub

	}

}
