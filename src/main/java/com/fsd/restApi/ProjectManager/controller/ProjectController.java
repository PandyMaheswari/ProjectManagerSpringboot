package com.fsd.restApi.ProjectManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.restApi.ProjectManager.beans.ProjectInput;
import com.fsd.restApi.ProjectManager.beans.ProjectOutput;
import com.fsd.restApi.ProjectManager.beans.TaskInput;
import com.fsd.restApi.ProjectManager.beans.TaskOutput;
import com.fsd.restApi.ProjectManager.entity.Project;
import com.fsd.restApi.ProjectManager.entity.ParentTask;
import com.fsd.restApi.ProjectManager.entity.Task;
import com.fsd.restApi.ProjectManager.entity.Users;
import com.fsd.restApi.ProjectManager.service.ProjectService;
import com.fsd.restApi.ProjectManager.service.TaskService;
import com.fsd.restApi.ProjectManager.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/projectApi")
public class ProjectController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/users")
	public List<Users> getallUsers(){
		return userService.getallUsers();
	}
	
	@PostMapping("/addUser")
	public Users addUsers(@RequestBody Users uio){
		
		return userService.addUser(uio);
		
	}
	
	@PutMapping("/usr")
	public Users updUsers(@RequestBody Users uio){
		
		return userService.updUser(uio);
		
	}
	@DeleteMapping("/usr/{delid}")
	public List<Users> delUsers(@PathVariable("delid") int delid){
		return userService.delUser(delid);
	}
	@GetMapping("/projects")
	public List<ProjectOutput> getallProjectDetails(){
		return projectService.getallProjectDetails();
	}
	
	@PostMapping("/addProject")
	public Project addProject(@RequestBody ProjectInput pi){
		return projectService.addProject(pi);
	}
	
	@PostMapping("/ptsk")
	public ParentTask addPTask(@RequestBody String ParentTask){
		return taskService.addParentTask(ParentTask);
	}
	@GetMapping("/tasks")
	public List<TaskOutput> getallTasks(){
		return taskService.getallTasks();
	}
	
	@PostMapping("/tsk")
	public Task addTask(@RequestBody TaskInput ti){
		return taskService.addTask(ti);
	}
	@PostMapping("/tsksts")
	public void updTaskStatus(@RequestBody TaskOutput ti){
		 taskService.updTaskStatus(ti);
	}
}
