package com.narendra.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.narendra.entity.User;

@RestController
@RequestMapping("/elkstack")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	List<User> list = List.of(new User(1, "Narendra", "UP"), new User(2L, "Sharad", "Pune"));
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable("userId") long userId ) {
		
		User user = list.stream().filter(u->u.getUserId() == userId).findAny().orElse(null);
		
		if (user != null) {
			logger.info("User found" + user);
			return user;
		}else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("User not found with ID --> " + userId);
			}
			return new User();
		}
	}
}
