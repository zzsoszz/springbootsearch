package com.bxtel.model.model;
import com.bxtel.model.*;
import java.util.*;
public class com.bxtel.model.Sms  
{
	
		 public long id;//id
		 public java.lang.String mobile;//mobile
		 public java.lang.String content;//content
		 public java.lang.String msgid;//msgid
		 public java.lang.String status;//status
		public String totalCount;
		public String crowid;
	
		
		 public void setId(long id)
		 {
		 	this.id=id;
		 }
		 public long getId()
		 {
		 	return this.id;
		 }
		 public void setMobile(java.lang.String mobile)
		 {
		 	this.mobile=mobile;
		 }
		 public java.lang.String getMobile()
		 {
		 	return this.mobile;
		 }
		 public void setContent(java.lang.String content)
		 {
		 	this.content=content;
		 }
		 public java.lang.String getContent()
		 {
		 	return this.content;
		 }
		 public void setMsgid(java.lang.String msgid)
		 {
		 	this.msgid=msgid;
		 }
		 public java.lang.String getMsgid()
		 {
		 	return this.msgid;
		 }
		 public void setStatus(java.lang.String status)
		 {
		 	this.status=status;
		 }
		 public java.lang.String getStatus()
		 {
		 	return this.status;
		 }
	
	
		public String getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}
		
		public String getCrowid() {
			return crowid;
		}
		public void setCrowid(String crowid) {
			this.crowid = crowid;
		}
		
		
	/*
		 model.setId("idvalue");
		 model.setMobile("mobilevalue");
		 model.setContent("contentvalue");
		 model.setMsgid("msgidvalue");
		 model.setStatus("statusvalue");
		 model.getId();
		 model.getMobile();
		 model.getContent();
		 model.getMsgid();
		 model.getStatus();
	*/
}

