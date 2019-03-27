package com.thesundaylunatics.model;

import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tb_customer")
@XmlRootElement
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	private String creditRisk;
	private String name;
	private String address;
	private Date dateRegistered;

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", creditRisk='" + creditRisk + '\'' +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", dateRegistered=" + dateRegistered +
				'}';
	}

	public String getCreditRisk() {
		return creditRisk;
	}

	public void setCreditRisk(String creditRisk) {
		this.creditRisk = creditRisk;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}



	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
}