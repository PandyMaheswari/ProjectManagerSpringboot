package com.fsd.restApi.ProjectManager.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Parent_Task")
public class ParentTask {
	
	
	@Id
	@Column(name = "Parent_ID")
	private int pid;



	@Column(name = "Parent_Task")
	private String parentTask;
	
	@OneToMany(targetEntity=Task.class, mappedBy ="pid", orphanRemoval=false, fetch=FetchType.LAZY)
	private Set<Task> tasks;
	

	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getParentTask() {
		return parentTask;
	}


	public void setParentTask(String parentTask) {
		this.parentTask = parentTask;
	}

	public Set<Task> getTasks() {
		return tasks;
	}


	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
}

