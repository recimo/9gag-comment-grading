package com.gag.commentgrading;

import com.gag.commentgrading.nlp.SentimentResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gag.commentgrading.nlp.SentimentAnalyzer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class CommentGradingApplication {

	public static HashMap<Integer, String> gradedCommentsMap = new HashMap<>();

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CommentGradingApplication.class, args);

		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/output.csv"));
		String line =  null;

		int i = 0;
		while((line=br.readLine())!=null){
			gradedCommentsMap.put(i, line);
			i++;
		}
	}
}
