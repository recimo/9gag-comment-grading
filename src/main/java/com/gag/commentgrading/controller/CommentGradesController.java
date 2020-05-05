package com.gag.commentgrading.controller;

import com.gag.commentgrading.CommentGradingApplication;
import com.gag.commentgrading.model.*;
import com.gag.commentgrading.nlp.SentimentAnalyzer;
import com.gag.commentgrading.nlp.SentimentResult;
import com.gag.commentgrading.service.CommentService;
import com.gag.commentgrading.service.PostGradeService;
import edu.stanford.nlp.process.DocumentPreprocessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/api/rest/grade")
public class CommentGradesController {

	@Autowired
	CommentService commentService;
	@Autowired
	PostGradeService postGradeService;

	@RequestMapping(value = "/save", method = RequestMethod.GET, produces = "application/json")
	private ResponseEntity<?> saveGrades() {
		SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
		sentimentAnalyzer.init();

		for (Comment comment : commentService.findAll()) {
			if ((CommentGradingApplication.gradedCommentsMap.containsValue(comment.getCommentId()))) {
				continue;
			}
			PostGrade postGrade = postGradeService.findByPostId(
					comment.getPermalink().split("/")[comment.getPermalink().split("/").length - 1].split("#")[0]);
			if (postGrade == null) {
				postGrade = new PostGrade();
				postGrade.setPostId(
						comment.getPermalink().split("/")[comment.getPermalink().split("/").length - 1].split("#")[0]);
			}
			try {
				if (comment.getRichtext() != null)
					if (!comment.getRichtext().isEmpty()) {
						String text = comment.getRichtext();
						text = text.replaceAll("@[^ ]+", "");

						SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(text);

						CommentGrades commentGrades = new CommentGrades();
						commentGrades.setCommentId(comment.getCommentId());
						commentGrades.setVeryPositive(sentimentResult.getSentimentClass().getVeryPositive());
						commentGrades.setPositive(sentimentResult.getSentimentClass().getPositive());
						commentGrades.setNeutral(sentimentResult.getSentimentClass().getNeutral());
						commentGrades.setNegative(sentimentResult.getSentimentClass().getNegative());
						commentGrades.setVeryNegative(sentimentResult.getSentimentClass().getVeryNegative());
						commentGrades.setSentimentType(fromInteger(sentimentResult.getSentimentScore()));

						postGrade.getGrades().add(commentGrades);

						postGradeService.save(postGrade);
					}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return new ResponseEntity<>(HttpStatus.OK);
	}

	public static SentimentType fromInteger(int x) {
		switch (x) {
		case 0:
			return SentimentType.veryPositive;
		case 1:
			return SentimentType.positive;
		case 2:
			return SentimentType.neutral;
		case 3:
			return SentimentType.negative;
		default:
			return SentimentType.veryNegative;
		}
	}
}
