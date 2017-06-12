package com.library.mdct.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.library.mdct.dto.BorrowerVO;

@Repository
public class BorrowerDAOImpl implements BorrowerDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public BorrowerVO borrowerSearch(String borNo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BorrowerVO> borrowerList() throws Exception {
		return sqlSession.selectList("bor.borList");
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
