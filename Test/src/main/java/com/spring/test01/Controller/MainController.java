package com.spring.test01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = "/main", method = RequestMethod.GET )
	public String MainView() {
		
		return "main/test.tiles";
	}
	
}
