package com.example.mobiledemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mobiledemo.model.Question;
@Repository
public interface OneToManyRepo extends JpaRepository<Question, Integer>{

}