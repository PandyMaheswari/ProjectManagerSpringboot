package com.fsd.restApi.ProjectManager.beans;



public class UserIO {
	
	private int userid;
	private String fname;
	private String lname;
	private int employeeid;
	private int projectid;
	private int taskid;
	
	public UserIO() {
		
	}
	public UserIO(int userid, String fname, String lname, int employeeid, int projectid, int taskid) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.employeeid = employeeid;
		this.projectid = projectid;
		this.taskid = taskid;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	
	
	
	


}
