package com.example.mobiledemo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mobiledemo.model.Admin;

@Repository
public interface Adminrepo extends JpaRepository<Admin,Integer> {

	List<Admin> findAll();
	
	

}
