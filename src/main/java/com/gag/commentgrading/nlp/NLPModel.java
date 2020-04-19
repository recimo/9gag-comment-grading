package com.gag.commentgrading.nlp;
 /*
  * "Very negative" = 0
  * "Negative" = 1
  * "Neutral" = 2
  * "Positive" = 3
  * "Very positive" = 4
  */

public class NLPModel {

    private int veryPositive;
    private int positive;
    private int neutral;
    private int negative;
    private int veryNegative;

    public int getVeryPositive() {
        return veryPositive;
    }

    public void setVeryPositive(int veryPositive) {
        this.veryPositive = veryPositive;
    }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }

    public int getNeutral() {
        return neutral;
    }

    public void setNeutral(int neutral) {
        this.neutral = neutral;
    }

    public int getNegative() {
        return negative;
    }

    public void setNegative(int negative) {
        this.negative = negative;
    }

    public int getVeryNegative() {
        return veryNegative;
    }

    public void setVeryNegative(int veryNegative) {
        this.veryNegative = veryNegative;
    }
}
