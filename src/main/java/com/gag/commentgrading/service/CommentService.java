package com.gag.commentgrading.service;

import java.util.List;

import com.gag.commentgrading.model.Comment;
import com.gag.commentgrading.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

	@Autowired
	CommentRepository repository;

	public Comment save(Comment comment) {
		return repository.save(comment);
	}

	public List<Comment> findAll() {
		return repository.findAll();
	}

}
