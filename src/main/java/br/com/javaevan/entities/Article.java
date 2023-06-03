package br.com.javaevan.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.List;


/**
 * The persistent class for the article database table.
 * 
 */
@Entity
@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Lob
	private String articletxt;

	private String banner;

	private String registerdate;

	private String title;

	private String totalviews;

	private String txtpreview;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="author")
	private User user;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category")
	private Category categoryObj;

	//bi-directional many-to-one association to Post
	@OneToMany(mappedBy="article")
	@JsonBackReference
	private List<Post> posts;

	public Article() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticletxt() {
		return this.articletxt;
	}

	public void setArticletxt(String articletxt) {
		this.articletxt = articletxt;
	}

	public String getBanner() {
		return this.banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getRegisterdate() {
		return this.registerdate;
	}

	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalviews() {
		return this.totalviews;
	}

	public void setTotalviews(String totalviews) {
		this.totalviews = totalviews;
	}

	public String getTxtpreview() {
		return this.txtpreview;
	}

	public void setTxtpreview(String txtpreview) {
		this.txtpreview = txtpreview;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategoryObj() {
		return this.categoryObj;
	}

	public void setCategoryObj(Category categoryObj) {
		this.categoryObj = categoryObj;
	}

	public List<Post> getPosts() {
		return this.posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public Post addPost(Post post) {
		getPosts().add(post);
		post.setArticle(this);

		return post;
	}

	public Post removePost(Post post) {
		getPosts().remove(post);
		post.setArticle(null);

		return post;
	}

}