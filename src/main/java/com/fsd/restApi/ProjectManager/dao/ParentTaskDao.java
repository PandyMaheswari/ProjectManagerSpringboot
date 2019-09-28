package com.fsd.restApi.ProjectManager.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsd.restApi.ProjectManager.entity.ParentTask;

public interface ParentTaskDao extends JpaRepository<ParentTask, Integer>{
	
	public ParentTask findByParentTask(@Param("parentTask") String parentTask);
	
	@Query("SELECT max(pid) FROM ParentTask")
	Integer getmaxParentTaskID();
	
    public ParentTask findByPid(@Param("pid") int pid);
	

}
