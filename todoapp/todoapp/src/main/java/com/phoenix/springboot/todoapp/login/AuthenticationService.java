package com.phoenix.springboot.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("phoenix");
		boolean isValidPassword = password.equalsIgnoreCase("password");
		
		boolean altUsername = username.equalsIgnoreCase("");
		boolean altPassword = password.equalsIgnoreCase("");
		
		return (isValidUserName && isValidPassword) || (altUsername && altPassword);
	}
}
