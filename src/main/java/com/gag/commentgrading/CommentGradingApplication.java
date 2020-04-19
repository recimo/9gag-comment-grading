package com.gag.commentgrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gag.commentgrading.nlp.SentimentAnalyzer;

@SpringBootApplication
public class CommentGradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentGradingApplication.class, args);		
	}
}
