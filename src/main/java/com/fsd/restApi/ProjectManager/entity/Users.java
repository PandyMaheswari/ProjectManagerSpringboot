package com.fsd.restApi.ProjectManager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	

	@Id
	@Column(name="User_ID")
	private int userid;

	@Column(name="First_Name")
	private String fname;
	
	@Column(name="Lastt_Name")
	private String lname;
	
	@Column(name="Employee_ID")
	private int empid;
	@Column(name="Project_ID")
	private int projectid;
	
	@Column(name="Task_ID")
	private int tid;
	public Users(){
		
	}
	
	public Users(int userid, String fname, String lname) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
	}
	
	public Users(int userid, String fname, String lname, int empid, int projectid, int tid) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.empid = empid;
		this.projectid = projectid;
		this.tid = tid;
	}
	
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
