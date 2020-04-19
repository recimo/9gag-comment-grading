package com.gag.commentgrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import nlp.*;

@SpringBootApplication
public class CommentGradingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentGradingApplication.class, args);
	}

	String text = "Today was a good day";
	SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();



}
