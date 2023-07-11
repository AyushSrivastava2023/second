package com.nagarro.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.nagarro.model.Users;

import com.nagarro.repository.UserRepo;



@Controller
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute Users users, Model model) {
		
		System.out.println(users.toString());
		
		repo.save(users);
		List<Users> list = repo.findAll();
		
		
		model.addAttribute("users", list);
		
		return "userList";
		
	}
	
//	public List<Users> getAll() {
//		
//		
//	}
	
	

}
