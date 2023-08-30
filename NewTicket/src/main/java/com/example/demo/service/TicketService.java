package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ticketclass1;
import com.example.demo.repository.TicketRepo1;

@Service
public class TicketService {
	@Autowired
	public TicketRepo1 hrepo;
	
	//post data
	public String saveReview(Ticketclass1 h)
	{
		hrepo.save(h);
		return "Data is saved to database";
	}
	
	//get data
	public List<Ticketclass1 > getReview()
	{
		return hrepo.findAll();
	}
	
	//update the data
	public Ticketclass1  updateReview(Ticketclass1  hm)
	{
		return hrepo.saveAndFlush(hm);
	}
	
	//delete the data
		public void deleteReview(int id)
		{
			System.out.println("Deleted");
			hrepo.deleteById(id);
		}
		
		//sorting
		
		public List<Ticketclass1 > sortByAsc(String name)
		{
			return hrepo.findAll(org.springframework.data.domain.Sort.by(name).ascending());
		}
		
		//pagination
				public List<Ticketclass1 > pagination(int pnum,int psize)
				{
					Page<Ticketclass1 > cont=hrepo.findAll(PageRequest.of(pnum, psize));
					return cont.getContent();
				}
				
			//pagination and sorting
				public List<Ticketclass1 > paginationAndSorting(int pnum,int psize,String name)
				{
					Page<Ticketclass1 > cont1=hrepo.findAll(PageRequest.of(pnum, psize, Sort.by(name)));
					return cont1.getContent();
				}
}
