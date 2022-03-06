package com.tqpp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tqpp.Dao.UserDao;
import com.tqpp.Model.User;

@Service
public class UserServicesImpl implements UserService {

	@Autowired
	private UserDao  userdao;
	
	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
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

}
