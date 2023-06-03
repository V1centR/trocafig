package br.com.javaevan.model;

import java.util.List;

public class PaginatorModel {
	
	public Integer registersPage;
	public Integer totalpages;
	public Integer totalPosts;
	public List<HomePostsModel> posts;
	
	
	public Integer getTotalPosts() {
		return totalPosts;
	}
	public void setTotalPosts(Integer totalPosts) {
		this.totalPosts = totalPosts;
	}
	public List<HomePostsModel> getPosts() {
		return posts;
	}
	public void setPosts(List<HomePostsModel> posts) {
		this.posts = posts;
	}
	public Integer getRegistersPage() {
		return registersPage;
	}
	public void setRegistersPage(Integer registersPage) {
		this.registersPage = registersPage;
	}
	public Integer getTotalpages() {
		return totalpages;
	}
	public void setTotalpages(Integer totalpages) {
		this.totalpages = totalpages;
	}
}
