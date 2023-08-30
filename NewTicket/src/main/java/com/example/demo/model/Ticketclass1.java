package com.example.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Ticketclass1 {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int appId;
	private int appCode;
	private String appName;
	private int appPrice;
	private int appQty;
	private String appCity;
	
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="custId")
  private Ticketclass3 ac;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fkid",referencedColumnName="appId")
	private List<Ticketclass3> customer;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fkid",referencedColumnName="appId")
	private List<Ticketclass2> category;
	
	
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public int getAppCode() {
		return appCode;
	}
	public void setAppCode(int appCode) {
		this.appCode = appCode;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public int getAppPrice() {
		return appPrice;
	}
	public void setAppPrice(int appPrice) {
		this.appPrice = appPrice;
	}
	public int getAppQty() {
		return appQty;
	}
	public void setAppQty(int appQty) {
		this.appQty = appQty;
	}
	public String getAppCity() {
		return appCity;
	}
	public void setAppCity(String appCity) {
		this.appCity = appCity;
	}
	public Ticketclass3 getAc() {
		return ac;
	}
	public void setAc(Ticketclass3 ac) {
		this.ac = ac;
	}
	public List<Ticketclass3> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Ticketclass3> customer) {
		this.customer = customer;
	}
	
}
