package Pract;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans {

	@Id
	@Column(name="Ans_id")
	private int ansid;
	private String ans;
	
	
	@ManyToOne
	private Ques ques;
	public Ans(int ansid, Ques ques, String ans) {
		super();
		this.ansid = ansid;
		this.ques = ques;
		this.ans = ans;
	}
	public Ques getQues() {
		return ques;
	}
	public void setQues(Ques ques) {
		this.ques = ques;
	}
	@Override
	public String toString() {
		return "Ans [ansid=" + ansid + ", ques=" + ques + ", ans=" + ans + "]";
	}
	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ans(int ansid, String ans) {
		super();
		this.ansid = ansid;
		this.ans = ans;
	}
	public int getAnsid() {
		return ansid;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
}
