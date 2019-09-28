package com.fsd.restApi.ProjectManager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsd.restApi.ProjectManager.beans.TaskCount;
import com.fsd.restApi.ProjectManager.entity.Task;

public interface TaskDao extends JpaRepository<Task, Integer>{
	
	@Query("SELECT max(tid) FROM Task")
	Integer getmaxTaskId();
	
	@Query("SELECT new com.fsd.restApi.ProjectManager.beans.TaskCount(projectid,count(tid)) FROM Task GROUP BY projectid")
	List<TaskCount> getTotalTasks();
	@Query("SELECT new com.fsd.restApi.ProjectManager.beans.TaskCount(projectid,count(tid)) FROM Task"
			+ " WHERE status='Y' GROUP BY projectid")
	List<TaskCount> getTotalCompletedTasks();
	
	@Modifying
	@Query("UPDATE Task SET status = 'Y' WHERE tid = :tid")
	int updateTaskStatus(@Param("tid") int tid);
	
}
