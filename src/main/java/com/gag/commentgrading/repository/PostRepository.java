package com.gag.commentgrading.repository;

import com.gag.commentgrading.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, String>{

}
