package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_timetable")
public class Timetable {
	
	private  String act;
	private  Date Stime;//开始时间
	private  Date Ftime;//结束时间
	
	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
	public String getAct() {
		return act;
	}
	public void setAct(String act) {
		this.act = act;
	}
	public Date getStime() {
		return Stime;
	}
	public void setStime(Date stime) {
		Stime = stime;
	}
	public Date getFtime() {
		return Ftime;
	}
	public void setFtime(Date ftime) {
		Ftime = ftime;
	}
	
}
