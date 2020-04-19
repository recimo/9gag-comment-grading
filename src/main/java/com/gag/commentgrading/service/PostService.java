package com.gag.commentgrading.service;

import com.gag.commentgrading.model.Post;
import com.gag.commentgrading.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostService {

	@Autowired
	PostRepository repository;
	
	public Post save(Post post) {
		return repository.save(post);
	}
}
