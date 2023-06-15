package com.example.mobiledemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mobiledemo.model.Answer;

@Repository
public interface OneToManyRepository extends JpaRepository<Answer,Integer>{

}
