package com.gag.commentgrading.service;

import java.util.List;

import com.gag.commentgrading.model.ActualPost;
import com.gag.commentgrading.repository.ActualPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActualPostService {

	@Autowired
	ActualPostRepository repository;

	public ActualPost save(ActualPost post) {
		return repository.save(post);
	}

	public List<ActualPost> findAll(){
		return repository.findAll();
	}
}
