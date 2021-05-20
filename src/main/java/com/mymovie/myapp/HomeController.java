package com.mymovie.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mymovie.model.MovieDAO;

@Controller
public class HomeController {
	
	@Autowired
	private MovieDAO moviedDAO;
	
	@RequestMapping("/home.do")
	public String home(Model model) {
		return "home";
	}
	
	@RequestMapping("/content.do")
	public String Content(Model model) {
		return "content";
	}
}
