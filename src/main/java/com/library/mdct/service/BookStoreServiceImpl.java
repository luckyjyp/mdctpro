package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.library.mdct.dao.LibraryDAO;

@Service
public class BookStoreServiceImpl implements LibraryService {

	@Resource(name="bookStoreDAOImpl")
	private LibraryDAO libraryDAO;
	
	
	@Override
	public List<Map<String,String>> searchList() throws Exception {
		return (List<Map<String, String>>) libraryDAO.searchList();
	}

	@Override
	public Object oneSearch(String obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Map<String, String> map) throws Exception {
		libraryDAO.insert(map);
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
