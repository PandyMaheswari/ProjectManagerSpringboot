package com.fsd.restApi.ProjectManager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fsd.restApi.ProjectManager.beans.ProjectInput;
import com.fsd.restApi.ProjectManager.beans.ProjectOutput;
import com.fsd.restApi.ProjectManager.beans.TaskCount;
import com.fsd.restApi.ProjectManager.dao.ProjectDao;
import com.fsd.restApi.ProjectManager.dao.TaskDao;
import com.fsd.restApi.ProjectManager.dao.UserDao;
import com.fsd.restApi.ProjectManager.entity.Project;
import com.fsd.restApi.ProjectManager.entity.Users;

@Service
@Transactional
public class ProjectService {

	@Autowired
	private ProjectDao projectDao;

	@Autowired
	private TaskDao taskDao;

	@Autowired
	private UserDao userDao;

	public List<Users> getallUsers() {
		return userDao.findAll();
	}

	public List<Project> getallProjects() {
		return projectDao.findAll();
	}

	public List<ProjectOutput> getallProjectDetails() {
		List<Project> pl = getallProjects();
		
		List<Users> usrs = getallUsers();
		List<ProjectOutput> pol = new ArrayList<ProjectOutput>();

		for (Project pj : pl) {
			System.out.println(pj);
			ProjectOutput po = new ProjectOutput();
			po.setComptsk(0);
			po.setTottsk(0);
			po.setEmpid(0);
			po.setProjectid(pj.getProjectid());
			po.setProject(pj.getProject());
			po.setSdate(pj.getSdate());
			po.setEdate(pj.getEdate());

			Users usr = usrs.stream().filter(u -> pj.getProjectid() == u.getProjectid()).findAny().orElse(null);
			if (usr != null) {
				po.setEmpid(usr.getEmpid());
			}
			pol.add(po);
		}
		
		return pol;
	}

	public Project addProject(ProjectInput pi) {

		Project p = new Project();
		p.setProjectid(projectDao.getmaxProjectId() + 1);
		p.setProject(pi.getProject());
		p.setSdate(pi.getSdate());
		p.setEdate(pi.getEdate());
		p.setPriority(pi.getPriority());
		Project np = projectDao.saveAndFlush(p);
		int rowsupdated = userDao.updateProjectID(np.getProjectid(), pi.getEmpid());
		System.out.println("Rows Updated:" +rowsupdated);
		return np;
	}

	public Project updProject(ProjectInput pu) {

		Project p = new Project();
		p.setProjectid(pu.getProjectid());
		p.setProject(pu.getProject());
		p.setSdate(pu.getSdate());
		p.setEdate(pu.getEdate());
		p.setPriority(pu.getPriority());
		Project np = projectDao.saveAndFlush(p);
		return np;
	}

	public String delProject(int delproid) {

		projectDao.deleteById(delproid);

		return "deleted";
	}
}
