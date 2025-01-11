package com.aps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

//	Earlier both get and post were handled by same request
//	We need to have different type of action

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

//	If only one mapping was there then you'll get 404 error as post is not present
//	To resolve this we create post request handler

	@RequestMapping(value = "/login")
	public String goToWelcomePage() {
		return "welcome";
	}
}
