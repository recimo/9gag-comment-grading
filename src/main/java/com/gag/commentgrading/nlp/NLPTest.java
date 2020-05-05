package com.gag.commentgrading.nlp;

import edu.stanford.nlp.coref.data.CorefChain;
import edu.stanford.nlp.ling.*;
import edu.stanford.nlp.ie.util.*;
import edu.stanford.nlp.neural.rnn.RNNCoreAnnotations;
import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.semgraph.*;
import edu.stanford.nlp.sentiment.SentimentCoreAnnotations;
import edu.stanford.nlp.trees.*;
import edu.stanford.nlp.util.CoreMap;

import java.util.*;

public class NLPTest {

	/*
	 * public static String text = "Joe Smith was born in California. " +
	 * "In 2017, he went to Paris, France in the summer. " +
	 * "His flight left at 3:00pm on July 10th, 2017. " +
	 * "After eating some escargot for the first time, Joe said, \"That was delicious!\" "
	 * + "He sent a postcard to his sister Jane Smith. " +
	 * "After hearing about Joe's trip, Jane decided she might go to France one day."
	 * ;
	 */
//
//	public static void main(String[] args) {
//		String text = "  I somehow   thought the   dad died   from a car crash and this was what it was left";
//
//        SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
//
//        sentimentAnalyzer.init();
//
//        SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(text);
//
//		text = text.replaceAll("@[^ ]+", "");
////		System.out.println(text);
//
//        System.out.println("Sentiments Classification:");
//
//        System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive()+"%");
//
//        System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive()+"%");
//
//        System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral()+"%");
//
//        System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative()+"%");
//
//        System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative()+"%");
//
//        System.out.println("\nSentiments result:");
//
//        System.out.println("Sentiment Score: " + sentimentResult.getSentimentScore());
//
//        System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
//
//	}
}
