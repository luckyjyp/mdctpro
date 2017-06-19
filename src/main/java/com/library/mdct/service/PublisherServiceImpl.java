package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.library.mdct.dao.PublisherDAO;

@Service
public class PublisherServiceImpl implements PublisherService {
	@Inject
	PublisherDAO publisherDAO;
	
	@Override
	public List<? extends Object> searchList() throws Exception {
		return publisherDAO.searchList();
	}

	@Override
	public Object oneSearch(String obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Object obj) throws Exception {
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
