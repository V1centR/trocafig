package br.com.javaevan.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.javaevan.entities.Article;
import br.com.javaevan.entities.Post;
import br.com.javaevan.repo.ArticleRepo;
import br.com.javaevan.service.ArticleService;

@Service("articleServiceImpl")
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	ArticleRepo repo;

	@Override
	public Optional<Article> findById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(Integer.valueOf(id));
	}	

}
