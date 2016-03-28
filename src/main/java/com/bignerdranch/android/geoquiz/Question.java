package com.bignerdranch.android.geoquiz;

/**
 * Created by there on 3/25/2016.
 */


public class Question {

    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int textResID, boolean answerTrue) {
        mTextResID = textResID;  // resource ID of question text
        mAnswerTrue = answerTrue;  // question answer
    }

    public int getTextResID() {
        return mTextResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
