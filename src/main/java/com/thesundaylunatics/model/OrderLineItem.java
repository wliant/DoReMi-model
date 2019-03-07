package com.thesundaylunatics.model;

import javax.persistence.*;
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

    private int quantity;
    private double value;

	@Override
	public String toString() {
		return "OrderLineItem{" +
				"id=" + id +
				", product=" + product +
				", quantity=" + quantity +
				", value=" + value +
				", lineItermValue=" + lineItermValue +
				'}';
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
