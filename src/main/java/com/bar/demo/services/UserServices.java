package com.bar.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bar.demo.model.User;
import com.bar.demo.repositories.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getUsers() {
		List<User> usuarios = userRepository.findAll();
		return usuarios;
	}

}
