package com.gag.commentgrading.service;

import com.gag.commentgrading.model.PostSection;
import com.gag.commentgrading.repository.PostSectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostSectionService {

	@Autowired
	PostSectionRepository repository;

	public PostSection save(PostSection postSection) {
		return repository.save(postSection);
	}
}
