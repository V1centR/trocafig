package br.com.javaevan.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class HomePostsModel {
	
	public Integer id;
	public String banner;
	public String register;
	public String smalltxt;
	public String title;	
	public Integer category;
	public String categoryName;
	public String userName;
	public String userAvatar;
	public int articleId;
	
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int i) {
		this.articleId = i;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer i) {
		this.id = i;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getSmalltxt() {
		return smalltxt;
	}
	public void setSmalltxt(String smalltxt) {
		this.smalltxt = smalltxt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer i) {
		this.category = i;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAvatar() {
		return userAvatar;
	}
	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}	

}
