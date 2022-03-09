package com.tqpp.Service;

import java.util.List;

import com.tqpp.Model.User;

public interface UserService {
	
	boolean addUser(User u);

	boolean deleteUserById(int uid);

	boolean updateUser(User u);

	List<User> getAllUsers();

	User getUserById(int id);
	
	User getUserByNameAndPassword(String name,String password);
	
	List<User> getUserByName(String userName);
	
}
