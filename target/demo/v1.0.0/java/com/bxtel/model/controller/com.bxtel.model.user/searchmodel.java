package com.bxtel.model.model;
import com.bxtel.model.*;
import java.util.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "database", type = "com.bxtel.model.User?lower_case", shards = 1, replicas = 0, refreshInterval = "-1")
public class com.bxtel.model.User  
{
	
		 @Id
		 private String indexid;
		
		 public long id;//id
		 public java.lang.String email;//email
		 public java.lang.String name;//name
	
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
	
	/*
		 model.setId("idvalue");
		 model.setEmail("emailvalue");
		 model.setName("namevalue");
		 model.getId();
		 model.getEmail();
		 model.getName();
	*/
}

