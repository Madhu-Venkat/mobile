package com.example.mobiledemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobiledemo.Repository.Adminrepo;
import com.example.mobiledemo.model.Admin;

@Service
public class Adminservice {

	@Autowired
	Adminrepo ar;
	public String checkLoginn(String username, String password) {
	    List<Admin> li=ar.findAll();
	    String res=null;
	    for(Admin  l:li) {
	    	if(l.getUsername().equals(username)&&l.getPassword().equals(password)) {
	    		res="Login Successful";
	    	}
	    }
	    if(res==null)
	    {
	    	res="Login Failed";
	    }
	    return res;
	    
}
	
	
}
