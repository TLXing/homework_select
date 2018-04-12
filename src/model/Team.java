package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="t_team")
public class Team {
	
	private int defId;//答辩ID
	private String studentId;//分组成员ID
	public int getDefId() {
		return defId;
	}
	public void setDefId(int defId) {
		this.defId = defId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
