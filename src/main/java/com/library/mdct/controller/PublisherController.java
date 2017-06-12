package com.library.mdct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/publisher/*")
public class PublisherController {
	
	@RequestMapping("publist.do")
	public String publisherList(){
		
		return "publisher/pub_list";
	}
}
