package com.fsd.restApi.ProjectManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fsd.restApi.ProjectManager.dao.UserDao;
import com.fsd.restApi.ProjectManager.entity.Users;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDao userDao;

	public List<Users> getallUsers() {
		return userDao.getallUsersDetails();
	}

	public Users addUser(Users uio) {
		Users usr = new Users();
	    if(uio.getUserid() == 0){
	    	usr.setUserid(userDao.getmaxusrid() + 1);
	    }else{
	    	usr.setUserid(uio.getUserid());
	    }
		
		usr.setFname(uio.getFname());
		usr.setLname(uio.getLname());
		usr.setEmpid(uio.getEmpid());
		usr.setProjectid(0);
		usr.setTid(0);
		Users newusr = userDao.saveAndFlush(usr);
		return newusr;
	}

	public Users updUser(Users uio) {
		/*
		 * Users usr = new Users(); usr.setUserid(uio.getUserid());
		 * usr.setFname(uio.getFname()); usr.setLname(uio.getLname());
		 * usr.setEmpid(uio.getEmpid());
		 */

		Users updusr = userDao.saveAndFlush(uio);
		return updusr;
	}

	public List<Users> delUser(int delusrid) {
		userDao.deleteById(delusrid);
		List<Users> usrlst = getallUsers();

		return usrlst;
	}
}
