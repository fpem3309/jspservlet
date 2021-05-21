package com.mymovie.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mymovie.model.MovieDAO;
import com.mymovie.model.MovieVO;

@Controller
public class HomeController {
	
	@Autowired
	private MovieDAO movieDAO;
	
	@RequestMapping("/home.do")
	public String home(Model model, MovieVO vo) {
		model.addAttribute("vo",vo);
		return "home";
	}
	
	@RequestMapping("/content.do")
	public String Content(Model model, MovieVO vo) {
		List<MovieVO> list = movieDAO.movieList(vo);
		model.addAttribute("list",list);
		return "content";
	}
}
