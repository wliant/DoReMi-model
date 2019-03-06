package com.thesundaylunatics.model;

import javax.persistence.*;

@Entity
@Table(name="tb_orderdiscount")
public class OrderDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@OneToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;

	@OneToOne
    @JoinColumn(name="order_id", referencedColumnName = "id")
    private Order order;

	private Double orderDiscount;

    @Override
    public String toString() {
        return "OrderDiscount{" +
                "id=" + id +
                ", customer=" + customer +
                ", order=" + order +
                ", orderDiscount=" + orderDiscount +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Double getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(Double orderDiscount) {
        this.orderDiscount = orderDiscount;
    }
}
