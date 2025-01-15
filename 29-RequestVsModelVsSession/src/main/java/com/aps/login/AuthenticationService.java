package com.aps.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("abhay");
		boolean isValidPassword = password.equalsIgnoreCase("123");

		return isValidUsername && isValidPassword;
	}
}
