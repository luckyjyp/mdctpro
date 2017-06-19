package com.library.mdct.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.library.mdct.dto.BookVO;
import com.library.mdct.dto.BorrowerVO;
import com.library.mdct.dto.LibraryVO;
import com.library.mdct.dto.PublisherVO;
import com.library.mdct.service.BookServiceImpl;
import com.library.mdct.service.BookStoreServiceImpl;
import com.library.mdct.service.BorrowerService;
import com.library.mdct.service.LibraryService;
import com.library.mdct.service.PublisherService;

@Controller
@RequestMapping("/library/*")
public class LibraryController {
	
	@Inject
	BorrowerService borrower;
	
	@Inject
	PublisherService publisher;
	
	
	
	@Resource(name="libraryServiceImpl")
	LibraryService library;
	
	@Resource(name="bookServiceImpl")
	LibraryService libraryBook;
	
	@Resource(name="rentalServiceImpl")
	LibraryService libraryRental;
	
	@Resource(name="bookStoreServiceImpl")
	LibraryService bookStore;
	
	@RequestMapping("library.do")
	public String libraryController(Model model) throws Exception{
		List<LibraryVO> list = (List<LibraryVO>) library.searchList();
		model.addAttribute("list", list);
		return "library/librarylist";
	};
	
	
	////////////////////대출자관리///////////////
	@RequestMapping("borrower.do")
	public String borrowerController(Model model) throws Exception{
		List<BorrowerVO> list = borrower.borrowerList();
		model.addAttribute("list", list);
		return "borrower/borrowerlist";
	}
	
	///////////////////도서관리///////////////////
	@RequestMapping("book.do")
	public String bookController(Model model) throws Exception{
		List<BookVO> list = (List<BookVO>) libraryBook.searchList();
		model.addAttribute("list", list);
		return "book/booklist";
	}
	
	@RequestMapping("bookAdd.do")
	public String bookAdd(Model model) throws Exception{
		//출판사목록가져와서 list담에 bookAdd.jsp로 보내줌
		List<PublisherVO> list = (List<PublisherVO>) publisher.searchList();
		model.addAttribute("list",list);
		return "book/bookAdd";
	}
	
	//도서번호중복확인
	@RequestMapping(value="booknochk.do", method=RequestMethod.POST)
	@ResponseBody
	public String bookNoChk(@RequestBody String book_no) throws Exception{
		System.out.println("bookNoChk메소드로 들어온 값" + book_no);
		/*JSONParser jsonParser = new JSONParser();
		
		JSONObject jsonObj = (JSONObject) jsonParser.parse(book_no);
		String book_no_key = (String) jsonObj.get("book_no");
		System.out.println(book_no_key);
		String result="";
		boolean chkval =((BookServiceImpl) libraryBook).booknochk(book_no_key);
		System.out.println("controller에서 확인결과 " + chkval);*/
		String result="";
		boolean chkval =((BookServiceImpl) libraryBook).booknochk(book_no);
		if(chkval){
			result="O";
		}else{
			result="X";
		}
		return result;
	}
	
	@RequestMapping("bookInsert.do")
	public String bookInsert(@ModelAttribute BookVO vo) throws Exception{
		Map<String, String> map = new HashMap<String, String>();
		map.put("book_no", vo.getBook_no());
		map.put("book_name", vo.getBook_name());
		map.put("writer", vo.getWriter());
		map.put("genre", vo.getGenre());
		map.put("price", vo.getPrice());
		map.put("pub_no", vo.getPub_no());
		libraryBook.insert(map);
		return "redirect:/library/book.do";
	}
	
	@RequestMapping(value="bookSearch.do", method=RequestMethod.GET)
	public String bookSearch(@RequestParam String book_no,Model model) throws Exception{
		/*System.out.println(book_no);
		BookVO obj= libraryBook.oneSearch(book_no);
		System.out.println(obj.toString());*/
		List<PublisherVO> list = (List<PublisherVO>) publisher.searchList();
		model.addAttribute("list",list);
		model.addAttribute("book",libraryBook.oneSearch(book_no));
		return "book/bookSearch";
	}
	
	@RequestMapping(value="bookUpdate.do", method=RequestMethod.POST)
	public String bookUpdate(@ModelAttribute BookVO vo) throws Exception{
		Map<String, String> map = new HashMap<String, String>();
		map.put("book_no", vo.getBook_no());
		map.put("book_name", vo.getBook_name());
		map.put("writer", vo.getWriter());
		map.put("genre", vo.getGenre());
		map.put("price", vo.getPrice());
		map.put("pub_no", vo.getPub_no());
		libraryBook.update(map);
		return "redirect:/library/book.do";
	}
	
	@RequestMapping(value="bookDelete.do", method=RequestMethod.GET)
	public String bookDelete(@RequestParam String book_no) throws Exception{
		//System.out.println("controller에서"+vo.getBook_name());
		//String book_no= vo.getBook_no();
		System.out.println("controller에서"+book_no);
		libraryBook.delete(book_no);
		return "redirect:/library/book.do";
	}
	
	/////////////////보관 및 대여////////////////
	@RequestMapping("bookStore.do")
	public String bookStoreList(Model model) throws Exception{
		List<Map<String,String>> map = ((BookStoreServiceImpl) bookStore).searchList();
		model.addAttribute("list",map);
		return "book/bookstorelist";
	}
	
	@RequestMapping("bookStoreAdd.do")
	public String bookStoreAdd() throws Exception{
		return "book/bookstoreadd";
	}
	
	@RequestMapping(value="bookStoreInsert.do", method=RequestMethod.POST)
	public String bookStoreInsert(@RequestParam String lib_no, @RequestParam String book_no) throws Exception{
		System.out.println("controller로 들어온 값"+lib_no+", "+book_no);
		Map<String, String> map = new HashMap<String, String>();
		map.put("lib_no", lib_no);
		map.put("book_no",book_no);
		((BookStoreServiceImpl) bookStore).insert(map);
		return "redirect:/library/bookStore.do";
	}
	//도서번호중복확인
	@RequestMapping(value="storenochk.do", method=RequestMethod.POST)
	@ResponseBody
	public String storenochk(@RequestBody String book_no) throws Exception{
		System.out.println("bookNoChk메소드로 들어온 값" + book_no);
		String result="";
		boolean chkval =((BookServiceImpl) libraryBook).booknochk(book_no);
		if(chkval){
			result="O";
		}else{
			result="X";
		}
		return result;
	}
		
	//대출자중복확인
	@RequestMapping(value="bornochk.do", method=RequestMethod.POST)
	@ResponseBody
	public String bornochk(@RequestBody String bor_no) throws Exception{
		System.out.println("bookNoChk메소드로 들어온 값" + bor_no);
		String result="";
		boolean chkval =((BookServiceImpl) libraryBook).bornochk(bor_no);
		if(chkval){
			result="O";
		}else{
			result="X";
		}
		return result;
	}
			
	//대여or반납
	@RequestMapping("rental.do")
	public String rentalController() throws Exception{
		return "book/bookrent";
	}
	
	//대여
	@RequestMapping("rentalAdd.do")
	public String rentalInsert() throws Exception{
		return "book/bookrentaladd";
	}
	
	//반납
	@RequestMapping("rentalDelete.do")
	public String rentalDelete() throws Exception{
		return "book/rentaldelete";
	}
	
	@RequestMapping(value="bookRentalInsert.do", method=RequestMethod.POST)
	public String bookRentalInsert(@RequestParam String bor_no, @RequestParam String book_no) throws Exception{
		System.out.println("controller로 들어온 값"+bor_no+", "+book_no);
		return "redirect:/library/rental.do";
	}
}
