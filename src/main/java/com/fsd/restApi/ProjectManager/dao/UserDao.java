package com.fsd.restApi.ProjectManager.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsd.restApi.ProjectManager.entity.Project;
import com.fsd.restApi.ProjectManager.entity.Users;

public interface UserDao extends JpaRepository<Users, Integer>{
	
	@Query("SELECT new com.fsd.restApi.ProjectManager.entity.Users(userid,fname,lname,empid,"
			+ "projectid,tid) FROM Users")
	List<Users> getallUsersDetails();
	
	@Query("SELECT max(userid) FROM Users")
	Integer getmaxusrid();
	
	@Modifying
	@Query("UPDATE Users SET projectid = :projid WHERE empid = :eid")
	int updateProjectID(@Param("projid") int projid, @Param("eid") int eid);
	
	@Modifying
	@Query("UPDATE Users SET tid = :tid WHERE empid = :eid")
	int updateTaskID(@Param("tid") int tid, @Param("eid") int eid);
	public Users findByTid(@Param("tid") int tid);

}
