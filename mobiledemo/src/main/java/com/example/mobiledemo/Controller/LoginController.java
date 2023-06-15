package com.example.mobiledemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobiledemo.Service.LoginService;
import com.example.mobiledemo.model.Login;
@RestController
@CrossOrigin
public class LoginController {
	

		
			@Autowired
			private LoginService service;
			@GetMapping("/login")
			public String login(@RequestParam String user,@RequestParam String password)
			{
				return service.checkLogin(user, password);
			}
			@PostMapping("/register")
			public Login  registerr(@RequestBody Login id)
			{
				return service.register(id);
			}
			@PutMapping("/updateByPassword")
			public String updateByPassword(@RequestParam String password,@RequestParam String username)
			{
				
				int result=service.updateByPassword1(password, username);
				if(result>0)
				{
					return "updated";
				}
				else
				{
					return "not updated";
				}
			}
			@DeleteMapping("/remove")
		    public void delete(@RequestParam String username,@RequestParam String password) {
		    	service.deleteByUsername(username,password);
		    	
		    }
	}


