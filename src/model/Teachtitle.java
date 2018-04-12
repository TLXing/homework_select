package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_teachtitle")
public class Teachtitle {
	
	private int id; 			//Ö°³ÆID
	private String name;        //Ö°³ÆÃû³Æ
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
