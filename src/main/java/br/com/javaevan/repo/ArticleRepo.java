package br.com.javaevan.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.javaevan.entities.Article;

public interface ArticleRepo extends CrudRepository<Article, Integer> {

}
