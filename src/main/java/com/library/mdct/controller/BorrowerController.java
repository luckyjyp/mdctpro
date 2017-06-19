package com.library.mdct.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.library.mdct.dto.BorrowerVO;
import com.library.mdct.service.BorrowerService;

@Controller
@RequestMapping("/borrower/*")
public class BorrowerController {

	@Inject
	BorrowerService borrowerService;
	
	@RequestMapping("login.do")
	public String loginForm(){
		return "/member/login";
	}
	
	@RequestMapping("loginCheck.do")
	public ModelAndView login(HttpSession session, @ModelAttribute BorrowerVO vo) {
		boolean result = borrowerService.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		
		if(result == true) {
			mav.setViewName("borrower/borrower_main");
			mav.addObject("msg", "success");
		} else {
			mav.setViewName("member/login");
			mav.addObject("msg", "failure");
		}
		return mav;
	}
	
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session) {
		borrowerService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/login");
		mav.addObject("msg", "logout");
		return mav;
	}
}
