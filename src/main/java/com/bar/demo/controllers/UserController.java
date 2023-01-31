package com.bar.demo.controllers;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bar.demo.model.User;
import com.bar.demo.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServices userService; 
	
	@GetMapping
	public @ResponseBody List<User> getAllUsers(){
		var usuarios = userService.getUsers();
		return usuarios;
	}

}
