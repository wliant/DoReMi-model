package com.thesundaylunatics.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private boolean corporate;
	private double creditRiskScore;
	private String name;
	private String address;
	private String orderNo;
	private Date dateRegistered;
	private boolean latePayment;

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public boolean isCorporate() {
		return corporate;
	}



	public void setCorporate(boolean corporate) {
		this.corporate = corporate;
	}



	public double getCreditRiskScore() {
		return creditRiskScore;
	}



	public void setCreditRiskScore(double creditRiskScore) {
		this.creditRiskScore = creditRiskScore;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getOrderNo() {
		return orderNo;
	}



	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}



	public Date getDateRegistered() {
		return dateRegistered;
	}



	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}



	public boolean isLatePayment() {
		return latePayment;
	}



	public void setLatePayment(boolean latePayment) {
		this.latePayment = latePayment;
	}

    @Override
    public String toString() {
        return "Customer[id=" + id + ", name=" + name + "]";
    }

}