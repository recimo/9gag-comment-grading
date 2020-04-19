package com.gag.commentgrading.repository;

import java.util.List;

import com.gag.commentgrading.model.ActualPost;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ActualPostRepository extends  JpaRepository<ActualPost, Integer>{

	List<ActualPost> findAll();
}
