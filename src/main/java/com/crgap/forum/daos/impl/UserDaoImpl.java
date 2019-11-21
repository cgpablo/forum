package com.crgap.forum.daos.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crgap.forum.beans.User;
import com.crgap.forum.daos.UserDao;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findUserByUsername(String username) {
		return sessionFactory.getCurrentSession().get(User.class, username);
	}
}
