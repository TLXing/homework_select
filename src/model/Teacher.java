package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_teacher")
public class Teacher {
	
	private  String id;                  //用户名
	private  String name;				//姓名
	private String pwd;					//密码
	//private  int  teachtitleId;       //职称ID
	//private int officeId;                //办公室ID
	private String major;				//专业
	private int degreeId;             //学位
	private String gender;			//性别
	private String tel;					//电话
	private String email;				//邮箱
	private String registerdate;	//注册日期	
	private String ip;					//最近一次登陆IP
	private int disable;			//0-无效 1-有效
	
	private Subject subject;
	
	@Id
	@Column(name="id",unique=true,nullable=false,length=40)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(String registerdate) {
		this.registerdate = registerdate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getDisable() {
		return disable;
	}
	public void setDisable(int disable) {
		this.disable = disable;
	}
	
	public String getMajor() {
		return major;
	}
	
	@OneToOne(mappedBy = "teacher")
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	

}
