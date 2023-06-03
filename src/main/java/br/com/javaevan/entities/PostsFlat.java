package br.com.javaevan.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsFlat {
	
	private Integer id;
	private String categoty;
	private String title;

}
