package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_score")
public class Score {
	
	private String studentId;  //学生ID
	private int  subjectId;	//论文ID
	private int  assessScore;//教师评价分数
	private String comment;//教师评语
	private int rejoin;//答辩成绩
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
	public int getAssessScore() {
		return assessScore;
	}
	public void setAssessScore(int assessScore) {
		this.assessScore = assessScore;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getRejoin() {
		return rejoin;
	}
	public void setRejoin(int rejoin) {
		this.rejoin = rejoin;
	}
	
	
}
