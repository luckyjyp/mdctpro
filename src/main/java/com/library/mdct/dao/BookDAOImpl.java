package com.library.mdct.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.library.mdct.dto.BookVO;

@Repository
public class BookDAOImpl implements LibraryDAO {

	@Inject
	SqlSession sqlSession;
	
	//전체도서조회
	@Override
	public List<BookVO> searchList() throws Exception {
		return sqlSession.selectList("lib.booklist");
	}

	//도서상세조회
	@Override
	public BookVO oneSearch(String book_no) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("book_no",book_no);
		BookVO vo = sqlSession.selectOne("lib.bookInfo", map);
		//System.out.println("DAO거쳐서 가져온 정보"+vo.toString());
		return vo;
	}

	//도서신규생성
	@Override
	public void insert(Map<String, String> map) throws Exception {
		BookVO vo = new BookVO();
		//System.out.println(obj.toString());
		vo.setBook_no(map.get("book_no"));
		vo.setBook_name(map.get("book_name"));		
		vo.setWriter(map.get("writer"));		
		vo.setGenre(map.get("genre"));	
		vo.setPrice(map.get("price"));	
		vo.setPub_no(map.get("pub_no"));	
		
		
		sqlSession.insert("lib.bookInsert", vo);
	}

	//도서정보변경
	@Override
	public void update(Map<String, String> map) throws Exception {
		sqlSession.update("lib.bookUpdate", map);
	}

	//도서삭제
	@Override
	public void delete(String book_no) throws Exception {
		System.out.println("dao에서"+book_no);
		sqlSession.delete("lib.bookDelete",book_no);
	}

	//도서번호중복확인
	public boolean booknochk(String book_no) throws Exception{
		boolean result = false;
		int count = 0;
		/*Map<String, String> map = new HashMap<String, String>();
		map.put("book_no", book_no);*/
		count= sqlSession.selectOne("lib.booknochk",book_no);
		System.out.println("dao: "+count);
		if(count==0) result=true;
		return result;
	}
	
	//보관도서 중복확인
	public boolean storenochk(String book_no) throws Exception{
		boolean result = false;
		int count = 0;
		count= sqlSession.selectOne("lib.storenochk",book_no);
		System.out.println("dao: "+count);
		if(count==0) result=true;
		return result;
	}
	
	//대출자중복확인
	public boolean bornochk(String bor_no) throws Exception{
		boolean result = false;
		int count = 0;
		count= sqlSession.selectOne("lib.bornochk",bor_no);
		System.out.println("dao: "+count);
		if(count==0) result=true;
		return result;
	}
}
