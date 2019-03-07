package com.thesundaylunatics.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

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
    private Double orderValue;
    private Double orderDiscount;
    private Double discountedValue;
    
	@OneToMany(
			fetch=FetchType.EAGER,
			cascade = CascadeType.ALL,
            orphanRemoval = true
        )
    private Collection<OrderLineItem> orderItems;
	
	@Override
	public String toString() {
		return "Order{" +
				"id=" + id +
				", orderDate=" + orderDate +
				", customer=" + customer +
				", country='" + country + '\'' +
				", status='" + status + '\'' +
				", orderValue=" + orderValue +
				", orderDiscount=" + orderDiscount +
				", orderItems=" + orderItems +
				'}';
	}

	public Double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(Double orderValue) {
		this.orderValue = orderValue;
	}

	public Double getOrderDiscount() {
		return orderDiscount;
	}

	public void setOrderDiscount(Double orderDiscount) {
		this.orderDiscount = orderDiscount;
	}

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

	public Double getDiscountedValue() {
		return discountedValue;
	}

	public void setDiscountedValue(Double discountedValue) {
		this.discountedValue = discountedValue;
	}
}
