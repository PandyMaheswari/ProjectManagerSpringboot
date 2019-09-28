package com.fsd.restApi.ProjectManager.beans;

import java.time.LocalDate;

public class TaskInput {

	private String project;
	private String task;
	private int taskid;	
	private String parenttask;	
	private int employeeid;
	private LocalDate sdate;	
	private LocalDate edate;	
	private int priority;
	private int empid;	

	public TaskInput(){
		
	}
	
	public TaskInput(String project, String task, int taskid, String parenttask, int employeeid, LocalDate sdate,
			LocalDate edate, int priority, int empid) {
		super();
		this.project = project;
		this.task = task;
		this.taskid = taskid;
		this.parenttask = parenttask;
		this.employeeid = employeeid;
		this.sdate = sdate;
		this.edate = edate;
		this.priority = priority;
		this.empid = empid;
	}
	
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	public String getParenttask() {
		return parenttask;
	}
	public void setParenttask(String parenttask) {
		this.parenttask = parenttask;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public LocalDate getSdate() {
		return sdate;
	}
	public void setSdate(LocalDate sdate) {
		this.sdate = sdate;
	}
	public LocalDate getEdate() {
		return edate;
	}
	public void setEdate(LocalDate edate) {
		this.edate = edate;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}

	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}
