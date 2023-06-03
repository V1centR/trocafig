package br.com.javaevan.service;

import java.util.Optional;

import br.com.javaevan.entities.Article;

public interface ArticleService {

	public Optional<Article> findById(String id);
}
