package com.gag.commentgrading.repository;

import com.gag.commentgrading.model.PostGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostGradeRepository extends JpaRepository<PostGrade, Long> {
}
