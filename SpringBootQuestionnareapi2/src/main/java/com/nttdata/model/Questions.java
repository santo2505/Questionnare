package com.nttdata.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Questions {
	
	@Id
	private int qid;
	private String ques;
	private String choice1;
	private String choice2;
	private String choice3;
	private String choice4;
	private String correct;
	
	
	
	public Questions() {
		
	}

	public Questions(int qid, String ques, String choice1, String choice2, String choice3, String choice4,
			String correct) {
		super();
		this.qid = qid;
		this.ques = ques;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.correct = correct;
	}

	public int getQid() {
		return qid;
	}



	public void setQid(int qid) {
		this.qid = qid;
	}



	public String getQues() {
		return ques;
	}



	public void setQues(String ques) {
		this.ques = ques;
	}



	public String getChoice1() {
		return choice1;
	}



	public void setChoice1(String choice1) {
		this.choice1 = choice1;
	}



	public String getChoice2() {
		return choice2;
	}



	public void setChoice2(String choice2) {
		this.choice2 = choice2;
	}



	public String getChoice3() {
		return choice3;
	}



	public void setChoice3(String choice3) {
		this.choice3 = choice3;
	}



	public String getChoice4() {
		return choice4;
	}



	public void setChoice4(String choice4) {
		this.choice4 = choice4;
	}



	public String getCorrect() {
		return correct;
	}



	public void setCorrect(String correct) {
		this.correct = correct;
	}



	



	@Override
	public String toString() {
		return "Questions [qid=" + qid + ", ques=" + ques + ", choice1=" + choice1 + ", choice2=" + choice2
				+ ", choice3=" + choice3 + ", choice4=" + choice4 + ", correct=" + correct + "]";
	}
	
	

}
