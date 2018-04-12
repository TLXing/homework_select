package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_message")
public class Message {
	
	private int id; 					//ID						 
	private String title;               //标题
	private String content;				//内容
	private String  sender;	           //发送人ID
	private String receiver;			//接收人ID
	private Date sendtime;                //发送时间
	private int 	senderdisable;		//发送人删除标志
	private int   receivererdisable;	//接收人删除标志
	private int   hasread;					//阅读标志1-没读，0-已读
	private int  parentId;				//父ID（看不懂这属性）
	private int  level;						//0-一般消息，1-专业消息，2-院级消息，3-校级消息
	
	@Id
	@GeneratedValue(generator="_native")
	@GenericGenerator(name="_native",strategy="native")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getSendtime() {
		return sendtime;
	}
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}
	public int getSenderdisable() {
		return senderdisable;
	}
	public void setSenderdisable(int senderdisable) {
		this.senderdisable = senderdisable;
	}
	public int getReceivererdisable() {
		return receivererdisable;
	}
	public void setReceivererdisable(int receivererdisable) {
		this.receivererdisable = receivererdisable;
	}
	public int getHasread() {
		return hasread;
	}
	public void setHasread(int hasread) {
		this.hasread = hasread;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
