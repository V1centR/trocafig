package br.com.javaevan.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import br.com.javaevan.entities.Post;

@Component
public interface PostService {
	
	public List<Post> findAll(Pageable pageable);
	public Post findById(String id);

}
