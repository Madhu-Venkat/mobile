package com.example.mobiledemo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobiledemo.Repository.LoginRepo;
import com.example.mobiledemo.model.Login;

import jakarta.transaction.Transactional;




@Service
public class LoginService {
	

		@Autowired
		private LoginRepo repository;
		
		public String checkLogin(String uname, String pwd) {
		    List<Login> li=repository.findAll();
		    String res=null;
		    for(Login  l:li) {
		    	if(l.getUname().equals(uname)&&l.getPwd().equals(pwd)) {
		    		res="Login Successful";
		    	}
		    }
		    if(res==null)
		    {
		    	res="Login Failed";
		    }
		    return res;
		    
	}
		public Login register(Login id)
		{
			return repository.save(id);
		}
		@Transactional
		public int updateByPassword1(String pwd,String uname)
		{
			return repository.updateByPassword(pwd,uname);
		}
		@Transactional
		public void deleteByUsername(String username, String password) {
			// TODO Auto-generated method stub
			 repository.deleteByUsername(username,password);
		}
}
