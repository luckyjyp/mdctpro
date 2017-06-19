package com.library.mdct.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.library.mdct.dao.BookDAOImpl;
import com.library.mdct.dao.LibraryDAO;
import com.library.mdct.dto.BookVO;

@Service
public class BookServiceImpl implements LibraryService {
	
	@Resource(name="bookDAOImpl")
	private LibraryDAO libraryDAO;
	
	/*
	 @Inject
	 LibraryDAO libraryDAO;
	 */
	
	@Inject
	BookDAOImpl bookDAOImpl;
	
	@Override
	public List<BookVO> searchList() throws Exception {
		return (List<BookVO>) libraryDAO.searchList();
	}

	@Override
	public BookVO oneSearch(String obj) throws Exception {
		return (BookVO) libraryDAO.oneSearch(obj);
	}

	@Override
	public void insert(Map<String, String> map) throws Exception {
		libraryDAO.insert(map);
	}

	@Override
	public void update(Map<String, String> map) throws Exception {
		libraryDAO.update(map);
	}

	@Override
	public void delete(String book_no) throws Exception {
		System.out.println("service에서"+book_no);
		libraryDAO.delete(book_no);
	}
	
	//도서번호중복확인
	public boolean booknochk(String book_no) throws Exception{
		boolean result = bookDAOImpl.booknochk(book_no);
		return result;
	}
	
	//보관도서중복확인
	public boolean storenochk(String book_no) throws Exception{
		boolean result = bookDAOImpl.storenochk(book_no);
		return result;
	}
	
	//대출자중복확인
	public boolean bornochk(String bor_no) throws Exception{
		boolean result = bookDAOImpl.bornochk(bor_no);
		return result;
	}
}
