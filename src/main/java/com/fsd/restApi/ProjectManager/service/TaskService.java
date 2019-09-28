package com.fsd.restApi.ProjectManager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsd.restApi.ProjectManager.beans.TaskInput;
import com.fsd.restApi.ProjectManager.beans.TaskOutput;
import com.fsd.restApi.ProjectManager.dao.ProjectDao;
import com.fsd.restApi.ProjectManager.dao.ParentTaskDao;
import com.fsd.restApi.ProjectManager.dao.TaskDao;
import com.fsd.restApi.ProjectManager.dao.UserDao;
import com.fsd.restApi.ProjectManager.entity.ParentTask;
import com.fsd.restApi.ProjectManager.entity.Project;
import com.fsd.restApi.ProjectManager.entity.Task;
import com.fsd.restApi.ProjectManager.entity.Users;

@Service
@Transactional
public class TaskService {
	
	@Autowired
	private ParentTaskDao parentTaskDao;
	
	@Autowired 
	private TaskDao taskDao;
	
	@Autowired
	private ProjectDao projectDao;
	
	@Autowired
	private UserDao userDao;
	
	public List<ParentTask> getallParentTasks(){
		return parentTaskDao.findAll();
	}
	
	public List<TaskOutput> getallTasks(){
		List<TaskOutput> tos = new ArrayList<TaskOutput>();
		List<Task> tsks = taskDao.findAll();
		for(Task tsk: tsks){
			TaskOutput to = new TaskOutput();
			to.setTid(tsk.getTid());
			to.setTask(tsk.getTask());
			to.setPriority(tsk.getPriority());
			to.setEdate(tsk.getEdate());
			to.setSdate(tsk.getSdate());
			to.setStatus(tsk.getStatus());
			ParentTask pt = parentTaskDao.findByPid(tsk.getPid());
			to.setPtask(pt.getParentTask());
			Project pj = projectDao.findByProjectid(tsk.getProjectid());
			to.setProject(pj.getProject());
			Users usr = userDao.findByTid(tsk.getTid());
			to.setEmpid(usr.getEmpid());
			tos.add(to);
		}
		return tos;
	}
	
	public ParentTask addParentTask(String ParentTask){
		ParentTask np = new ParentTask();
		np.setPid(parentTaskDao.getmaxParentTaskID() + 1);
		np.setParentTask(ParentTask);
		ParentTask ptsk = parentTaskDao.saveAndFlush(np);
		return ptsk;		
		
	}
	
	public Task addTask(TaskInput ti){
		
		Task nt = new Task();
		nt.setTid(taskDao.getmaxTaskId() + 1);
		ParentTask pt = parentTaskDao.findByParentTask(ti.getParenttask().trim());
		System.out.println("Parent Task "+pt.getPid());
		System.out.println("Project Name "+ti.getProject());
		Project p = projectDao.findByProject(ti.getProject().trim());
		nt.setPid(pt.getPid());
		nt.setProjectid(p.getProjectid());
		nt.setTask(ti.getTask());
		nt.setSdate(ti.getSdate());
		nt.setEdate(ti.getEdate());
		nt.setPriority(ti.getPriority());
		nt.setStatus('N');
		Task ntt = taskDao.saveAndFlush(nt);
		int rowsupd = userDao.updateTaskID(ntt.getTid(), ti.getEmpid());
		System.out.println("Rows updated:" +rowsupd);
		return ntt;
			
	}
	
	public void updTaskStatus(TaskOutput ti){
		System.out.println(ti.getTid());
		int rowsupd = taskDao.updateTaskStatus(ti.getTid());
		System.out.println("Rows Updated:" +rowsupd);
	}

}
