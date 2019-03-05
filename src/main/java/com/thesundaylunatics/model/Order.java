package com.thesundaylunatics.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_order")
public class Order {

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private Date orderDate;
    
    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
    
    private String country;
    private String status;
    private BigDecimal orderValue;
    private boolean isApproved;
    private BigDecimal orderDiscount;

	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", orderDate=" + orderDate +
				", customer=" + customer +
				", country='" + country + '\'' +
				", status='" + status + '\'' +
				", orderValue=" + orderValue +
				", isApproved=" + isApproved +
				", orderDiscount=" + orderDiscount +
				", orderItems=" + orderItems +
				'}';
	}

	public BigDecimal getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(BigDecimal orderValue) {
		this.orderValue = orderValue;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean approved) {
		isApproved = approved;
	}

	public BigDecimal getOrderDiscount() {
		return orderDiscount;
	}

	public void setOrderDiscount(BigDecimal orderDiscount) {
		this.orderDiscount = orderDiscount;
	}

	@OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "order",
            orphanRemoval = true
        )
    private Collection<OrderLineItem> orderItems;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Collection<OrderLineItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Collection<OrderLineItem> orderItems) {
		this.orderItems = orderItems;
	}
}
