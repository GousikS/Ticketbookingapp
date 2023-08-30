package com.example.demo.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticketclass2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int catId;
	private String catName;
	private int catAddress;
	private String catDescription;
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public int getCatAddress() {
		return catAddress;
	}
	public void setCatAddress(int catAddress) {
		this.catAddress = catAddress;
	}
	public String getCatDescription() {
		return catDescription;
	}
	public void setCatDescription(String catDescription) {
		this.catDescription = catDescription;
	}
	
	
}
