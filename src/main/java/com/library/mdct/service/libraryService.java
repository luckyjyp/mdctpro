package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import com.library.mdct.dto.libraryVO;

public interface libraryService {
	//도서관 전체리스트
	public List<libraryVO> libraryList() throws Exception;
	//도서관 상세정보조회
	public libraryVO librarySearch(String libNo) throws Exception;
	//도서관 정보삽입
	public void libraryInsert(libraryVO vo) throws Exception;
	//도서관 정보변경
	public void libraryUpdate(Map<String, String> map) throws Exception;
	//도서관 정보삭제
	public void libraryDelete(String libNo) throws Exception;
}
