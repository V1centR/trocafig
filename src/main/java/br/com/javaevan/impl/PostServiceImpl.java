package br.com.javaevan.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.javaevan.entities.Post;
import br.com.javaevan.repo.PostsRepo;
import br.com.javaevan.service.PostService;

@Service("postServiceImpl")
public class PostServiceImpl implements PostService {
	
	
	@Autowired
	PostsRepo postRepo;

	@Override
	public List<Post> findAll(Pageable pageable) {
		
		return postRepo.findAll(pageable);
	}

	@Override
	public Post findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
