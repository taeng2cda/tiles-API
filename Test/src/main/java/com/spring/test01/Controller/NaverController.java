package com.spring.test01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.test01.Service.BoardService;
import com.spring.test01.Vo.BoardVo;

import oracle.jdbc.proxy.annotation.Post;


@Controller
public class NaverController {
	
	@Autowired BoardService service;
	
	@GetMapping("/naver")
	public String NaverView() {
		return "main/naver.tiles";
	}
	
	
	@PostMapping("/savePost")
	public String InsertBoard(Model model,BoardVo vo) {
		
		vo.setUserid("test");
		System.out.println(vo.toString());
		
		service.BoardInsert(vo);
		
		return "home.tiles";
	}
	
}
