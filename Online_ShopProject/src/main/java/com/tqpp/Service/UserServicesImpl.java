package com.tqpp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tqpp.Dao.RoleDaoImpl;
import com.tqpp.Dao.UserDao;
import com.tqpp.Model.Role;
import com.tqpp.Model.User;

@Service
public class UserServicesImpl implements UserService {

	@Autowired
	private UserDao  userdao;
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@Autowired
	private RoleDaoImpl rdao;
/*	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		userdao.addUser(u);
		return true;
	}*/

	@Override
	public boolean addUser(User u) {
		

		
		String pass=u.getPassword();
		String encodepass=passEncoder.encode(pass);
		
		u.setPassword(encodepass);
		
		Role r=rdao.getRole(2);
		u.setRole(r);
		
	    userdao.addUser(u);
	    return true;
	    
	   
	}
	
	
	@Override
	public boolean deleteUserById(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userdao.getUserById(id);
	}

	@Override
	public User getUserByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		
		User u = userdao.getUserByNameAndPassword(name, password);
		return u;
	}
	

	@Override
	public List<User> getUserByName(String userName) {
		// TODO Auto-generated method stub
		return userdao.getUserByName(userName);
	}

	
	

}
