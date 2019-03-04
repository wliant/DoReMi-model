package com.thesundaylunatics.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_approval")
public class Approval {
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

	private boolean latePayment;
	private boolean defaulter;
	private String creditRisk;
	private BigDecimal orderValue;
	private boolean isApproved;

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

    public boolean isLatePayment() {
        return latePayment;
    }

    public void setLatePayment(boolean latePayment) {
        this.latePayment = latePayment;
    }

    public boolean isDefaulter() {
        return defaulter;
    }

    public void setDefaulter(boolean defaulter) {
        this.defaulter = defaulter;
    }

    public String getCreditRisk() {
        return creditRisk;
    }

    public void setCreditRisk(String creditRisk) {
        this.creditRisk = creditRisk;
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

    @Override
    public String toString() {
        return "Approval{" +
                "id=" + id +
                ", customer=" + customer +
                ", order=" + order +
                ", latePayment=" + latePayment +
                ", defaulter=" + defaulter +
                ", creditRisk='" + creditRisk + '\'' +
                ", orderValue=" + orderValue +
                ", isApproved=" + isApproved +
                '}';
    }
}
