package com.thesundaylunatics.model;

import javax.persistence.*;
import java.math.BigDecimal;

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

	private BigDecimal orderDiscount;

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

    public BigDecimal getOrderDiscount() {
        return orderDiscount;
    }

    public void setOrderDiscount(BigDecimal orderDiscount) {
        this.orderDiscount = orderDiscount;
    }
}
