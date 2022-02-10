package Pract;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ques {
	
	@Id
	@Column(name ="ques_id")
	private int quesid;
	private String ques;
	
	@OneToMany
	private List<Ans> ans;

	public Ques(int quesid, String ques, List<Ans> ans) {
		super();
		this.quesid = quesid;
		this.ques = ques;
		this.ans = ans;
	}

	public Ques() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuesid() {
		return quesid;
	}

	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Ans> getAns() {
		return ans;
	}

	public void setAns(List<Ans> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Ques [quesid=" + quesid + ", ques=" + ques + ", ans=" + ans + "]";
	}
	
	
	
	
	

}
