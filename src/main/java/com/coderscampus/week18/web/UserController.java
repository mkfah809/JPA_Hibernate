package com.coderscampus.week18.web;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coderscampus.week18.domain.User;
import com.coderscampus.week18.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public String getAllUsers(ModelMap model) {

		model.put("users", userService.findAll());
		return "users";
	}

	@GetMapping("users/{userId}")
	public String findById(ModelMap model, @PathVariable(name = "userId") Long userId) {
		User user = userService.findById(userId);
		model.put("users", Arrays.asList(user));
		return "users";
	}
}
