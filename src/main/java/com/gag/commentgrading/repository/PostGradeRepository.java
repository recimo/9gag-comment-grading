package com.gag.commentgrading.repository;

import com.gag.commentgrading.model.PostGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostGradeRepository extends JpaRepository<PostGrade, Long> {
    PostGrade findByPostId(String postId);
}
