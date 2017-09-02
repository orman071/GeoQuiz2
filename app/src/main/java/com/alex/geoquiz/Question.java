package com.alex.geoquiz;



class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    Question(int TextResId, boolean AnswerTrue){
        mTextResId = TextResId;
        mAnswerTrue = AnswerTrue;
    }

    int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
