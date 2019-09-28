package com.fsd.restApi.ProjectManager.beans;

import java.time.LocalDate;

public class TaskOutput {

	private int tid;
	private String task;
	private String ParentTask;
	private int priority;
	private LocalDate sdate;
	private LocalDate edate;
	private String project;
	private char status;
	private int empid;
	
	public TaskOutput(){
		
	}
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getPtask() {
		return ParentTask;
	}

	public void setPtask(String ParentTask) {
		this.ParentTask = ParentTask;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
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

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public TaskOutput(int tid, String task, String ParentTask, int priority, LocalDate sdate, LocalDate edate,
			String project, char status, int empid) {
		super();
		this.tid = tid;
		this.task = task;
		this.ParentTask = ParentTask;
		this.priority = priority;
		this.sdate = sdate;
		this.edate = edate;
		this.project = project;
		this.status = status;
		this.empid = empid;
	}
}
