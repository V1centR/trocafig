package br.com.javaevan.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String categoryname;

	//bi-directional many-to-one association to Post
	@OneToMany(mappedBy="categoryObj")
	@JsonBackReference
	private List<Post> posts;

	//bi-directional many-to-one association to Article
	@OneToMany(mappedBy="categoryObj")
	@JsonBackReference
	private List<Article> articles;

	public Category() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public List<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Post addPost(Post post) {
		getPosts().add(post);
		post.setCategoryObj(this);

		return post;
	}

	public Post removePost(Post post) {
		getPosts().remove(post);
		post.setCategoryObj(null);

		return post;
	}

	public List<Article> getArticles() {
		return this.articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Article addArticle(Article article) {
		getArticles().add(article);
		article.setCategoryObj(this);

		return article;
	}

	public Article removeArticle(Article article) {
		getArticles().remove(article);
		article.setCategoryObj(null);

		return article;
	}

}