package com.example.mobiledemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mobiledemo.model.Login;
@Repository

public interface LoginRepo extends JpaRepository<Login, Integer> {
@Modifying
@Query("update Login s set  s.pwd=?1 where s.uname=?2")
public int updateByPassword(String pwd,String uname);

@Modifying
@Query("delete from Login s where s.uname=?1 and s.pwd=?2")
public int deleteByUsername(String username,String password);
		
	}

