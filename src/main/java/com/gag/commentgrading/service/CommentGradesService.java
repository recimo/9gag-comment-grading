package com.gag.commentgrading.service;

import com.gag.commentgrading.model.CommentGrades;
import com.gag.commentgrading.repository.CommentGradesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentGradesService {

    @Autowired
    private CommentGradesRepository commentGradesRepository;

    public CommentGrades save(CommentGrades commentGrades) {
       return commentGradesRepository.save(commentGrades);
    }

    public List<CommentGrades> findAll() {
       return commentGradesRepository.findAll();
    }
}
