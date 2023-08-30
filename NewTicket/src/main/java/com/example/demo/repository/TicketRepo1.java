
package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Ticketclass1;



public interface TicketRepo1 extends JpaRepository<Ticketclass1, Integer>
{
	
	// native query
	@Query(value="select * from appliance_book", nativeQuery=true)
	public List<Ticketclass1> getAllRows();
}


