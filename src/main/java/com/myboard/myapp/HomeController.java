package com.myboard.myapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myboard.model.BoardDAO;
import com.myboard.model.BoardVO;

@Controller
public class HomeController {
	
	@Autowired
	private BoardDAO boardDAO;
	
	@RequestMapping("/home.do")
	public String home(Model model, BoardVO vo) {
		/*List<BoardVO> list = boardDAO.boardList(vo);
		model.addAttribute("list",list);*/
		return "home";
	}
	@RequestMapping("/content.do")
	public String content(Model model) {
		return "content";
	}
}
