package com.library.mdct.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

import com.library.mdct.dto.BookVO;
import com.library.mdct.dto.LibraryVO;

@Repository
public class LibraryDAOImpl implements LibraryDAO {

	@Inject
	SqlSession sqlSession;

	@Override
	public List<LibraryVO> searchList() throws Exception {
		
		return sqlSession.selectList("lib.librarylist");
		
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
		return sqlSession.selectList("lib.librarylist");
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

	}*/

	


}
