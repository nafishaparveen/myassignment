package com.codebind.collections;

import java.util.Set;

public class Questions {
	private int Questionid;
	private String Question;
	private Set<String> answer;
	public int getQuestionid() {
		return Questionid;
	}
	public void setQuestionid(int questionid) {
		Questionid = questionid;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	public Questions(int questionid, String question, Set<String> answer) {
		super();
		Questionid = questionid;
		Question = question;
		this.answer = answer;
	}
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Questions [Questionid=" + Questionid + ", Question=" + Question + ", answer=" + answer + "]";
	}
	
	

}
