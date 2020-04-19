package com.gag.commentgrading.model;

import javax.persistence.*;

@Entity
@Table(name="comment_grades")
public class CommentGrades {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String commentId;
    private Integer veryPositive;
    private Integer positive;
    private Integer neutral;
    private Integer negative;
    private Integer veryNegative;
    private SentimentType sentimentType;

    public CommentGrades() {
    }

    public CommentGrades(Long id, String commentId, Integer veryPositive, Integer positive, Integer neutral, Integer negative, Integer veryNegative, SentimentType sentimentType) {
        this.id = id;
        this.commentId = commentId;
        this.veryPositive = veryPositive;
        this.positive = positive;
        this.neutral = neutral;
        this.negative = negative;
        this.veryNegative = veryNegative;
        this.sentimentType = sentimentType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public Integer getVeryPositive() {
        return veryPositive;
    }

    public void setVeryPositive(Integer veryPositive) {
        this.veryPositive = veryPositive;
    }

    public Integer getPositive() {
        return positive;
    }

    public void setPositive(Integer positive) {
        this.positive = positive;
    }

    public Integer getNeutral() {
        return neutral;
    }

    public void setNeutral(Integer neutral) {
        this.neutral = neutral;
    }

    public Integer getNegative() {
        return negative;
    }

    public void setNegative(Integer negative) {
        this.negative = negative;
    }

    public Integer getVeryNegative() {
        return veryNegative;
    }

    public void setVeryNegative(Integer veryNegative) {
        this.veryNegative = veryNegative;
    }

    public SentimentType getSentimentType() {
        return sentimentType;
    }

    public void setSentimentType(SentimentType sentimentType) {
        this.sentimentType = sentimentType;
    }
}
