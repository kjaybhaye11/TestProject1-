package com.MApping2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Override
	public String toString() {
		return "Answer [answerid=" + answerid + ", answer=" + answer + ", question=" + question + "]";
	}
	@Id
	@Column(name ="answer_id")
	private int answerid;
	private String answer;
	
	@OneToOne
	private Question question;
	
	public Answer(int answerid, String answer, Question question) {
		super();
		this.answerid = answerid;
		this.answer = answer;
		this.question = question;
	}


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public int getAnswerid() {
		return answerid;
	}


	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}


	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
