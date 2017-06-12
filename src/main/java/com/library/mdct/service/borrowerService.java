package com.library.mdct.service;

import java.util.List;
import java.util.Map;

import com.library.mdct.dto.borrowerVO;

public interface borrowerService {
	//대출자상세정보조회
	public borrowerVO borrowerSearch(String borNo) throws Exception;
	//대출자 전체리스트
	public List<borrowerVO> borrowerList() throws Exception;
	//대출자등록
	public void borrowerInsert(borrowerVO vo) throws Exception;
	//대출자 정보변경
	public void borrowerUpdate(Map<String, String> map) throws Exception;
	//대출자 삭제
	public void borrowerDelete(String borNo) throws Exception;
}
