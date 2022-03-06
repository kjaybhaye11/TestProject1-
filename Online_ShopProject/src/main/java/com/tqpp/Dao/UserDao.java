package com.tqpp.Dao;

import java.util.List;

import com.tqpp.Model.User;

public interface UserDao {

	

	boolean addUser(User u);

	boolean deleteUserById(int uid);

	boolean updateUser(User u);

	List<User> getAllUsers();

	User getUserById(int id);
	
	User getUserByNameAndPassword(String name,String password);
	
}
