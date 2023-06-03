package br.com.javaevan.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;

import br.com.javaevan.entities.Post;
import br.com.javaevan.model.HomePostsModel;
import br.com.javaevan.model.PaginatorModel;

public class HomePostsDto {
	
	private Integer totalRegisters = 0;

	public PaginatorModel getHomePosts(Iterable<Post> iterable, Integer totalPosts) {

		List<HomePostsModel> dtoData = new ArrayList<>();
		
		PaginatorModel dtoDataPaginate = new PaginatorModel();

		for (Post item : iterable) {
			
			HomePostsModel model = new HomePostsModel();

			model.setId(item.getId());
			model.setBanner(item.getBanner());
			model.setRegister(item.getArticle().getRegisterdate());
			model.setSmalltxt(item.getSmalltxt());
			model.setTitle(item.getTitle());
			model.setCategory(item.getCategoryObj().getId());
			model.setCategoryName(item.getCategoryObj().getCategoryname());
			model.setUserName(item.getUserBean().getUsername());
			model.setUserAvatar(item.getUserBean().getAvatar());
			model.setArticleId(item.getArticle().getId());
			
			dtoData.add(model);
		}
		
				
		dtoDataPaginate.setRegistersPage(20);
		dtoDataPaginate.setTotalPosts(totalPosts);
		//TODO Set dynamicaly pages / registers
		dtoDataPaginate.setTotalpages(18);
		dtoDataPaginate.setPosts(dtoData);
		

		return dtoDataPaginate;
	}

	public PaginatorModel getHomePosts(List<Post> posts, Integer valueOf, Integer postsPages) {
		// TODO Auto-generated method stub
		return null;
	}


}
