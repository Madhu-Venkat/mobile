package com.example.mobiledemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobiledemo.Service.Adminservice;

@RestController
@CrossOrigin
public class Admincon {

	@Autowired
	Adminservice as;
	
	@GetMapping("/loginn")
	public String loginn(@RequestParam String username,@RequestParam String password)
	{
		return as.checkLoginn(username, password);
	}
	
}
