package com.library.mdct.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.library.mdct.dto.BorrowerVO;
import com.library.mdct.service.BorrowerService;

@Controller
@RequestMapping("/library/*")
public class LibraryController {
	
	@Inject
	BorrowerService borrower;
	
	//대출자관리
	@RequestMapping("borrower.do")
	public String borrowerController(ModelAndView mav) throws Exception{
		List<BorrowerVO> list = borrower.borrowerList();
		mav.addObject("list", list);
		return "borrower/borrowerlist";
	}
	
	//도서관리
	@RequestMapping("book.do")
	public String bookController(ModelAndView mav){
		return "book/booklist";
	}
	
	//보관 및 대여
	@RequestMapping("rental.do")
	public void rentalController(){
		
	}
	
}
