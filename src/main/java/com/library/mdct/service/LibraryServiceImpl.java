package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.library.mdct.dao.LibraryDAO;
import com.library.mdct.dto.BookVO;
import com.library.mdct.dto.LibraryVO;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Resource(name="libraryDAOImpl")
	private LibraryDAO libraryDAO;
	
	/*@Inject
	LibraryDAO libraryDAO;*/

	@Override
	public List<LibraryVO> searchList() throws Exception {
		return (List<LibraryVO>) libraryDAO.searchList();
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
	
	/*@Override
	public List<LibraryVO> libraryList() throws Exception {
		return libraryDAO.libraryList();
	}

	@Override
	public LibraryVO librarySearch(String libNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void libraryInsert(LibraryVO vo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void libraryUpdate(Map<String, String> map) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void libraryDelete(String libNo) throws Exception {
		// TODO Auto-generated method stub

	}

	*/

}
