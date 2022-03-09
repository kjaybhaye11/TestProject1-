package com.tqpp.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tqpp.Model.Role;
import com.tqpp.Model.User;


@Transactional
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		System.out.println("*"+u);
		Role r = sessionfactory.getCurrentSession().find(Role.class, 2);
		u.setRole(r);
		sessionfactory.getCurrentSession().save(u);
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
		// TODO Auto-generated method stu
		return sessionfactory.getCurrentSession().find(User.class,id);
	}

	@Override
	public User getUserByNameAndPassword(String name, String password) {
		// TODO Auto-generated method stub


		String query = "from User u where userName=:n and password=:p";
		Query  q = sessionfactory.getCurrentSession().createQuery(query);
		q.setParameter("n", name);
		q.setParameter("p", password);
		q.setMaxResults(1);
		User u = (User) q.uniqueResult();

		return u;
	}

	@Override
	public List<User> getUserByName(String userName) {
		// TODO Auto-generated method stub
		
		String query = "from User u where userName=:n ";
		Query  q = sessionfactory.getCurrentSession().createQuery(query);
		q.setParameter("n", userName);
		List<User> lst= q.list();
		return lst;
	}

}
