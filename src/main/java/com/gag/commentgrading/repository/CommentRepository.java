package com.gag.commentgrading.repository;

import java.util.List;

import com.gag.commentgrading.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, String> {

	List<Comment> findAll();
}
