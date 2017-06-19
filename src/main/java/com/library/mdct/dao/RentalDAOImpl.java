package com.library.mdct.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class RentalDAOImpl implements LibraryDAO {

	@Inject
	SqlSession sqlSession;
	
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
