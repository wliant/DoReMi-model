package com.thesundaylunatics.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="tb_orderlineitem")
public class OrderLineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
    
    @ManyToOne
    @JoinColumn(name = "order_fk", referencedColumnName = "id")
    private Order order;
    
    private int quantity;
    private double value;
    private String discription;
    private double lineItermDiscount;

	@Override
	public String toString() {
		return "OrderLineItem{" +
				"id=" + id +
				", product=" + product +
				", order=" + order +
				", quantity=" + quantity +
				", value=" + value +
				", discription='" + discription + '\'' +
				", lineItermDiscount=" + lineItermDiscount +
				", lineItermValue=" + lineItermValue +
				'}';
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public double getLineItermDiscount() {
		return lineItermDiscount;
	}

	public void setLineItermDiscount(double lineItermDiscount) {
		this.lineItermDiscount = lineItermDiscount;
	}

	public BigDecimal getLineItermValue() {
		return lineItermValue;
	}

	public void setLineItermValue(BigDecimal lineItermValue) {
		this.lineItermValue = lineItermValue;
	}

	private BigDecimal lineItermValue;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
