package br.com.javaevan.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javaevan.entities.Article;
import br.com.javaevan.impl.ArticleServiceImpl;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	ArticleServiceImpl service;
	
	@CrossOrigin
	@GetMapping("/open/{id}")
	public Optional<Article> openArticles(@PathVariable String id) {
		
		return service.findById(id);
	}

}
