package com.fsd.restApi.ProjectManager.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	


	@Id
	@Column(name="Project_ID")
	private int projectid;
	
	@Column(name="Project")
	private String project;
	
	@Column(name="Start_Date")
	private LocalDate sdate;
	
	@Column(name="End_Date")
	private LocalDate edate;
	
	@Column(name="Priority")
	private int priority;

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
	
	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", project=" + project + ", sdate=" + sdate + ", edate=" + edate
				+ ", priority=" + priority + "]";
	}
}

