package com.example.demo.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Querymodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int queid;
	private String quename;
	private int queaddress;
	private String quedescription;
	public int getQueid() {
		return queid;
	}
	public void setQueid(int queid) {
		this.queid = queid;
	}
	public String getQuename() {
		return quename;
	}
	public void setQuename(String quename) {
		this.quename = quename;
	}
	public int getQueaddress() {
		return queaddress;
	}
	public void setQueaddress(int queaddress) {
		this.queaddress = queaddress;
	}
	public String getQuedescription() {
		return quedescription;
	}
	public void setQuedescription(String quedescription) {
		this.quedescription = quedescription;
	}
	
	
	
}
