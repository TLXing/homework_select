package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_middlecheck")
public class Middlecheck {
	
	private int id;
	private String studentId;  //学生ID
	private int  subjectId;	//科目ID
	private String sketch;//简述
	private String problem;//问题和解决问题
	private String imagine;//下一步设想
	private String judge;//评价
	private Date time;//评价时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSketch() {
		return sketch;
	}
	public void setSketch(String sketch) {
		this.sketch = sketch;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getImagine() {
		return imagine;
	}
	public void setImagine(String imagine) {
		this.imagine = imagine;
	}
	public String getJudge() {
		return judge;
	}
	public void setJudge(String judge) {
		this.judge = judge;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
