package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import com.library.mdct.dto.BorrowerVO;


public interface BorrowerService {
	//대출자상세정보조회
	public BorrowerVO borrowerSearch(String borNo) throws Exception;
	//대출자 전체리스트
	public List<BorrowerVO> borrowerList() throws Exception;
	//대출자등록
	public void borrowerInsert(BorrowerVO vo) throws Exception;
	//대출자 정보변경
	public void borrowerUpdate(Map<String, String> map) throws Exception;
	//대출자 삭제
	public void borrowerDelete(String borNo) throws Exception;
}
