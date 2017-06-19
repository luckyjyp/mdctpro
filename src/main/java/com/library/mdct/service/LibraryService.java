package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.library.mdct.dto.BookVO;
import com.library.mdct.dto.LibraryVO;

public interface LibraryService {
	//전체리스트
	public List<? extends Object> searchList() throws Exception;
	//상세정보조회
	public Object oneSearch(String obj) throws Exception;
	//정보삽입
	public void insert(Map<String, String> map) throws Exception;
	//정보변경
	public void update(Map<String, String> map) throws Exception;
	//정보삭제
	public void delete(String obj) throws Exception;
	
	
	
	
}
