package com.bxtel.model.model;
import com.bxtel.model.*;
import java.util.*;
public class com.bxtel.model.User  
{
	
		 public long id;//id
		 public java.lang.String email;//email
		 public java.lang.String name;//name
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
		 public void setEmail(java.lang.String email)
		 {
		 	this.email=email;
		 }
		 public java.lang.String getEmail()
		 {
		 	return this.email;
		 }
		 public void setName(java.lang.String name)
		 {
		 	this.name=name;
		 }
		 public java.lang.String getName()
		 {
		 	return this.name;
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
		 model.setEmail("emailvalue");
		 model.setName("namevalue");
		 model.getId();
		 model.getEmail();
		 model.getName();
	*/
}

