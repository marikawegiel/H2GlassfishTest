package com.marika.H2GlassfishTest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "id")
	private Integer userId;
	
	@Column(name = "name")
	private String userName;
	
	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserId(Integer id) {
		this.userId = id;
	}

	public void setUserName(String name) {
		this.userName = name;
	}

}
