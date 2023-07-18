package com.digit.projectK;

public class Question {
	private String questionName;
	private String[] options;
	private int correctAnswer;
	private String[] optionsFor50_50;
	private int[] audiencePollPercentages;

	public Question(String questionName, String[] options, int correctAnswer, String[] optionsFor50_50,
			int[] audiencePollPercentages) {
		super();
		this.questionName = questionName;
		this.options = options;
		this.correctAnswer = correctAnswer;
		this.optionsFor50_50 = optionsFor50_50;
		this.audiencePollPercentages = audiencePollPercentages;
	}

	public String[] getOptionsFor50_50() {
		return optionsFor50_50;
	}

	public void setOptionsFor50_50(String[] optionsFor50_50) {
		this.optionsFor50_50 = optionsFor50_50;
	}

	public int[] getAudiencePollPercentages() {
		return audiencePollPercentages;
	}

	public void setAudiencePollPercentages(int[] audiencePollPercentages) {
		this.audiencePollPercentages = audiencePollPercentages;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
}
