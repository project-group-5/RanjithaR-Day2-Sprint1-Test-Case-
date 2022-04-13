package com.model;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.springframework.context.annotation.Profile;
@Profile(value="userName")
@Entity
@Table(name="UserProfileDetails")
public class UserProfileDetails {
	@Id
	@GeneratedValue
	private int userId;
    @NotNull
	@Email()
	@Valid()
	private String useremailId;
    @NotNull
	@Valid()
	private String userName;	
	private String address;
	
	private String mobile;
	private int age;
	private String dob;
	
	
	public UserProfileDetails() {
		
	}

	

	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUseremailId() {
		return useremailId;
	}

	public void setUseremailId(String useremailId) {
		this.useremailId = useremailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


}
