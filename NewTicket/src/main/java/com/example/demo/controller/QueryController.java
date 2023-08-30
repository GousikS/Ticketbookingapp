package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Querymodel;

import com.example.demo.service.QueryService;

@RestController
@RequestMapping("/")
public class QueryController {
	@Autowired
QueryService serv;
	
	@PostMapping("/save")
	public Querymodel saveDetails(@RequestBody Querymodel us) {
		return serv.saveDet(us);
	}

}
