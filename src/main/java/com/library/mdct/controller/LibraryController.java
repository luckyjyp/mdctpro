package com.library.mdct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/library/*")
public class LibraryController {
	
	//대출자관리
	@RequestMapping("borrower.do")
	public String borrowerController(ModelAndView mav){
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
