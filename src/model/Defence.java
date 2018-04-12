package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_defence")
public class Defence {
	
	private int id;
	private int personcount;//拟需学生人数
	private int personlave;//已选学生人数
	private Date time;//答辩时间
	private String place;//答辩地点
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPersoncount() {
		return personcount;
	}
	public void setPersoncount(int personcount) {
		this.personcount = personcount;
	}
	public int getPersonlave() {
		return personlave;
	}
	public void setPersonlave(int personlave) {
		this.personlave = personlave;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
