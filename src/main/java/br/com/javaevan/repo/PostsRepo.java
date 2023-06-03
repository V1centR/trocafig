package br.com.javaevan.repo;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.javaevan.entities.Post;

@Repository
public interface PostsRepo extends CrudRepository<Post, Integer> {
	
	//SELECT u.username FROM User u WHERE u.username LIKE %?1%
	//SELECT * FROM javaevangelist.posts;
//	@Query(value = "SELECT p.id, p.title, p.smalltxt, p.register, p.banner FROM Post p")
//    List<Post> findAllHome(Integer page);
	 List<Post> findAll(Pageable pageable);
	 
//	 @Query(value = "SELECT count(id) FROM Post p")
//	 List<Post> findAllCounter();
	
	
}
