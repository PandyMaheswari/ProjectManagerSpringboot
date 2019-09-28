package com.fsd.restApi.ProjectManager.beans;

public class TaskCount {
	

	private int projectid;
	private long count;
	
	public TaskCount(){
		
	}
	public TaskCount(int projectid, long count) {
		super();
		this.projectid = projectid;
		this.count = count;
	}
	public int getProjectid() {
		return projectid;
	}

	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}
