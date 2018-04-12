package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_prelection")
public class Prelection {
	
	private int id; 														 
	//private String subjectId;               //题目ID
	//private String studentId;				//学生ID
	private int choice;						//第几选择
	private Date selectdate;                //操作日期
	private int disable;				//0-有限，1-无效
	
	private Student student;
	private Subject subject;
	
	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public Date getSelectdate() {
		return selectdate;
	}
	public void setSelectdate(Date selectdate) {
		this.selectdate = selectdate;
	}
	public int getDisable() {
		return disable;
	}
	public void setDisable(int disable) {
		this.disable = disable;
	}
	
	@ManyToOne
    @JoinColumn(name="studentId")//学生ID
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	@ManyToOne
    @JoinColumn(name="subjectId")//题目ID
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	
	
}
