package org.spring.dao;

import org.spring.model.Login;
import org.spring.model.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
}