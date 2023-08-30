package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ticketclass1;
import com.example.demo.service.TicketService;

//import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class Ticketcontroller {
	@Autowired
	public TicketService hserv;
	
	//post mapping
	@PostMapping("/postReview")
	public String postSwag(@RequestBody Ticketclass1 hr)
	{
		hserv.saveReview(hr);
		return "Data saved";
	}
	
	//get mapping
	@GetMapping("/getReview")
	public List<Ticketclass1 > getSwagInfo()
	{
		return hserv.getReview();
	}
	
	//put mapping
	@PutMapping("/updateReview")
	public Ticketclass1  updateSwagInfo(@RequestBody Ticketclass1  ha)
	{
		return hserv.updateReview(ha);
	}
	
	//delete mapping using path variable
	@DeleteMapping("/deleteReview/{id}")
	public String removeSwag(@PathVariable("id") int hid)
	{
		hserv.deleteReview(hid);
		return "Swag with Id"+hid+" is deleted";
	}
	
	//sort by asc
	
			@GetMapping("/sortDsc/{name}")
			public List<Ticketclass1 > sortdsc(@PathVariable("name") String name)
			{
				return hserv.sortByAsc(name);
			}
			
			//pagination
			
			@GetMapping("/pagination/{num}/{size}")
			public List<Ticketclass1 >paginationEx(@PathVariable("num") int pnum,@PathVariable("size") int psize)
			{
				return hserv.pagination(pnum, psize);
			}
			
			
			//pagination and sorting
			
			@GetMapping("/paginations/{num}/{size}/{name}")
			public List<Ticketclass1>paginationAndsorting(@PathVariable("num") int pnum,@PathVariable("size") int psize,@PathVariable("name") String name)
			{
				return hserv.paginationAndSorting(pnum, psize, name);
			}
}
