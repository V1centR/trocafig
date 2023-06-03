package br.com.javaevan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.javaevan.dto.HomePostsDto;
import br.com.javaevan.entities.Post;
import br.com.javaevan.impl.PostServiceImpl;
import br.com.javaevan.model.HomePostsModel;
import br.com.javaevan.model.PaginatorModel;
import br.com.javaevan.repo.PostsRepo;
import br.com.javaevan.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostService postService;

	@Autowired
	PostsRepo postServiceRepo;

	@Autowired
	PostServiceImpl postServiceImpl;

	Pageable pageSetup;

	private Integer currentPage = 0;
	private Integer totalPages = 0;
	private Integer postsPages = 10;



	@CrossOrigin
	@GetMapping("/latest/{page}")
	public PaginatorModel articlesHome(@PathVariable String page) {

		System.out.println("page::: " + page);

		currentPage = Integer.valueOf(page) - 1;
		pageSetup = PageRequest.of(currentPage, postsPages);

		List<Post> posts = postServiceImpl.findAll(pageSetup);

		HomePostsDto data = new HomePostsDto();

		return data.getHomePosts(posts, Integer.valueOf((int) postServiceRepo.count()));
	}

	@CrossOrigin
	@GetMapping("/test/{page}")
	public PaginatorModel articlesTest(@PathVariable String page) {

		System.out.println("page::: " + page);

		currentPage = Integer.valueOf(page) - 1;
		pageSetup = PageRequest.of(currentPage, postsPages);

		List<Post> posts = postServiceImpl.findAll(pageSetup);

		HomePostsDto data = new HomePostsDto();

		return data.getHomePosts(posts, Integer.valueOf((int) postServiceRepo.count()));
	}

}
