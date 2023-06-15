package com.example.mobiledemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mobiledemo.model.mobiledemo;

@Repository
public interface mobiledemoRepository extends JpaRepository<mobiledemo,Integer>{
	@Modifying
    @Query("update mobiledemo s set s.price=?1 where s.model=?2")
    public int updatemobile(int price,String model);
}

