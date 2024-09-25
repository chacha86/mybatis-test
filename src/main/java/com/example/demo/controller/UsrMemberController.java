package com.example.demo.controller;

import com.example.demo.service.ArticleService;
import com.example.demo.vo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UsrMemberController {

	private ArticleService articleService;

	public UsrMemberController(ArticleService articleService) {
		this.articleService = articleService;
	}
	
}
