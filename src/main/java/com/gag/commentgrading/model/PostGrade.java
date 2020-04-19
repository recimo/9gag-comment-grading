package com.gag.commentgrading.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="post_grade")
public class PostGrade {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String postId;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CommentGrades> grades = new ArrayList<>();

    public PostGrade() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public List<CommentGrades> getGrades() {
        return grades;
    }

    public void setGrades(List<CommentGrades> grades) {
        this.grades = grades;
    }
}
