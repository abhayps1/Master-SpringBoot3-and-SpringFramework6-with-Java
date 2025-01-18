package com.aps.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class LoginController {

	@Autowired
	private AuthenticationService authenticationService;

//	Earlier both get and post were handled by same request
//	We need to have different type of action

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String gotoLoginPage() {
		return "login";
	}

//	If only one mapping was there then you'll get 404 error as post is not present
//	To resolve this we create post request handler

	@RequestMapping(value = "/login")
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationService.authenticate(name, password)) {
			model.put("username", name);
			model.put("password", password);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again");
		return "login";
	}
}
