package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Querymodel;

public interface QueryRepo extends JpaRepository<Querymodel, Integer>{

}
