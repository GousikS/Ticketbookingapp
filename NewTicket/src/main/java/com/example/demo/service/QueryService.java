package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Querymodel;
import com.example.demo.repository.QueryRepo;

@Service
public class QueryService {
	@Autowired
	QueryRepo qrepo;
	
	public Querymodel saveDet( Querymodel us) {
		return qrepo.save(us);
	}

}
