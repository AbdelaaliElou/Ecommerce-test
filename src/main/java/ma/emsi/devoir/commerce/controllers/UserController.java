package ma.emsi.devoir.commerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.emsi.devoir.commerce.services.services.IUserService;

@Controller
public class UserController {
	
	
	@Autowired
	private IUserService iUserService;
}
