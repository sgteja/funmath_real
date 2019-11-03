package com.example.funmath_real;

import android.app.Application;

public class funmath_real extends Application {
	@Override
	public void onCreate()
	{
		super.onCreate();
		
	}

	@Override
	public void onTerminate()
	{
		super.onTerminate();
		
	}
	
	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public int getQuestionsCorrect() {
		return questionsCorrect;
	}

	public void setQuestionsCorrect(int questionsCorrect) {
		this.questionsCorrect = questionsCorrect;
	}
	public void incrementQuestionsCorrect() {
		this.questionsCorrect ++;
	}

	public int getQuestionsAttempted() {
		return questionsAttempted;
	}

	public void setQuestionsAttempted(int questionsAttempted) {
		this.questionsAttempted = questionsAttempted;
	}
	public void incrementQuestionsAttempted() {
		this.questionsAttempted ++;
	}

	private String questionType;
	
	private int questionsCorrect;
	private int questionsAttempted;
}
