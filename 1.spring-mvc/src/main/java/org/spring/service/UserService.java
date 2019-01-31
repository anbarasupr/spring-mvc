package org.spring.service;

import org.spring.model.Login;
import org.spring.model.User;

public class UserService {

	public UserService(){
		System.out.println("****************UserService*******************");
	}
	public void register(User user) {
		// TODO Auto-generated method stub
		
	}

	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return new User("anbu","pr");
	}

}
