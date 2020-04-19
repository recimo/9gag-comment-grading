package com.gag.commentgrading.service;

import com.gag.commentgrading.model.PostGrade;
import com.gag.commentgrading.repository.PostGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostGradeService {

    @Autowired
    private PostGradeRepository postGradeRepository;

    public PostGrade save(PostGrade postGrade) {
        return postGradeRepository.save(postGrade);
    }

    public List<PostGrade> findAll() {
        return postGradeRepository.findAll();
    }
}
