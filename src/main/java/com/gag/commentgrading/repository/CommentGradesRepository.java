package com.gag.commentgrading.repository;

import com.gag.commentgrading.model.CommentGrades;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentGradesRepository extends JpaRepository<CommentGrades, Long> {
}
