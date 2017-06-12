package com.library.mdct;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		String intro="어서오세요 MDCT LIBRARY PROJECT입니다.";		
		model.addAttribute("intro", intro );
		model.addAttribute("library","lib.do");
		model.addAttribute("publisher","pub.do");
		model.addAttribute("borrower","bor.do");		
		return "main";
	}
	
	@RequestMapping(value="lib.do", method = RequestMethod.GET)
	public String libraryControlelr(){
		
		return "library/library_main";
	}
	
	@RequestMapping(value="pub.do", method = RequestMethod.GET)
	public String publisherControlelr(){
		
		return "publisher/publisher_main";
	}
	
	@RequestMapping(value="bor.do", method = RequestMethod.GET)
	public String borrowerControlelr(){
		
		return "borrower/borrower_main";
	}
}
