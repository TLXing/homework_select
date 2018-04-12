package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_openreport")
public class Openreport {
	
	private String subjectId;//题目ID
	private String studentId;//学生ID
	private String comment1;// 教研室主任意见
	private String person1;//教研室主任意见签署人
	private  Date  data1;   //教研室主任审核意见签署时间
	private String comment2;  //学院指导委员会意见
	private String person2;     //学院指导委员会意见签署人
	private  Date  data2;    //学院指导委员会意见签署日期
	private int disable;        //0-有效，1-无效，2-待审核
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getComment1() {
		return comment1;
	}
	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}
	public String getPerson1() {
		return person1;
	}
	public void setPerson1(String person1) {
		this.person1 = person1;
	}
	public Date getData1() {
		return data1;
	}
	public void setData1(Date data1) {
		this.data1 = data1;
	}
	public String getComment2() {
		return comment2;
	}
	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}
	public String getPerson2() {
		return person2;
	}
	public void setPerson2(String person2) {
		this.person2 = person2;
	}
	public Date getData2() {
		return data2;
	}
	public void setData2(Date data2) {
		this.data2 = data2;
	}
	public int getDisable() {
		return disable;
	}
	public void setDisable(int disable) {
		this.disable = disable;
	}
	
	
	
	
}
