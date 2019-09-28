package com.fsd.restApi.ProjectManager.beans;

import java.time.LocalDate;

public class ProjectInput {
	

	private int projectid;
	private String project;
	private LocalDate sdate;
	private LocalDate edate;
	private int priority;
	private int empid;
	
    public ProjectInput(){
    	
    }

	public ProjectInput(int projectid, String project,  LocalDate sdate, LocalDate edate,
			int priority, int empid) {
		super();
		this.projectid = projectid;
		this.project = project;		
		this.sdate = sdate;
		this.edate = edate;
		this.priority = priority;
		this.empid = empid;
	}
	
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
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
