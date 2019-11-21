package com.crgap.forum.daos;

import com.crgap.forum.beans.User;

public interface UserDao {

	User findUserByUsername(String username);
}