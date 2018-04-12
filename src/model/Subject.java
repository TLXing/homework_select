package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_subject")
public class Subject {
	
	private int id; 					//题目id（自增）
	//private String tea1Id;				//第一指导老师
	//private String studentId;			//学生
	//private String tea2Id;               //第二指导老师
	private String name;                  //题目名
	//private int typeId;                 //题目类型
	private int first;                  //0-不是第一次指导，1-第一次指导
	private int same;                   //0-不雷同，1-雷同
	private int personcount;              //拟需学生人数
	private int personlave;               //已选学生人数
	private int grade;                    //届
	//private int sourceId;                  //题目来源
	private String summary;                  //选题内容提要
	private String feasibility;              //可行性
	private String necessary;                 //必要性
	private int majorId;                     //题目给哪个专业学生选的           (有问题）
	private  Date  data;                    //提交日期
	private String comment1;                        //教研室主任意见
	private String person1;                   //教研室主任意见签署人
	private  Date  data1;                     //教研室主任审核意见签署时间
	private String comment2;                  //学院指导委员会意见
	private String person2;                       //学院指导委员会意见签署人
	private  Date  data2;                        //学院指导委员会意见签署日期
	private String ordernum;                     //查档编号
	private int disable;                          //0-有效，1-无效，2-待审核
	private int status;                          //状态
	private int othermajor;                        //其他可选专业
	
	private Teacher teacher;
	private Type type;
	private Source source;
	private Student student;
	
	
	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
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
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSame() {
		return same;
	}
	public void setSame(int same) {
		this.same = same;
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getFeasibility() {
		return feasibility;
	}
	public void setFeasibility(String feasibility) {
		this.feasibility = feasibility;
	}
	public String getNecessary() {
		return necessary;
	}
	public void setNecessary(String necessary) {
		this.necessary = necessary;
	}
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
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
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public int getDisable() {
		return disable;
	}
	public void setDisable(int disable) {
		this.disable = disable;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getOthermajor() {
		return othermajor;
	}
	public void setOthermajor(int othermajor) {
		this.othermajor = othermajor;
	}
	
	@OneToOne
    @JoinColumn(name="tea1Id")//指导老师ID
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@ManyToOne
    @JoinColumn(name="typeId")//题目类型Id
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	@OneToOne
    @JoinColumn(name="sourceId")//题目来源Id
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	
	@OneToOne
    @JoinColumn(name="studentId")//学生Id
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	

}
