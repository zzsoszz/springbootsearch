package com.bxtel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.data.elasticsearch.annotations.Document;
import dinamica.generator.Model;


@Model
@Entity
@Table(name = "sms")
@Document(indexName = "smsdatabase", type = "sms", shards = 1, replicas = 0, refreshInterval = "-1")
public class Sms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String mobile;
	
	@NotNull
	private String content;
	
	@NotNull
	private String msgid;
	
	@NotNull
	private String status;// 0.发送成功   1.已提交到第三方平台待发送    2.发送失败   3.重发中
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMsgid() {
		return msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}