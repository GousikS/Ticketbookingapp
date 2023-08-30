package com.example.demo.model;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticketclass3 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int custId;
	private String custName;
	private String custEmail;
	private String custAddress;
	private String custPayment;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustPayment() {
		return custPayment;
	}
	public void setCustPayment(String custPayment) {
		this.custPayment = custPayment;
	}
	
	
}
