package com.tqpp.Dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tqpp.Model.Role;

@Transactional
@Repository
public class RoleDaoImpl {

	
	

	@Autowired
	private SessionFactory sessionfactory;
	
	public Role getRole(int id)
	{
		return sessionfactory.getCurrentSession().find(Role.class,id);
	}
	
}
