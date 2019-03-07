package com.thesundaylunatics.model;

import javax.persistence.*;

@Entity
@Table(name="tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String productCategory;
    private String productTitle;
    private String productAuthor;
    private int yearOfPublication;
    private String publisher;
    private int availableInventory;
    private Double unitPrice;
    
	private String productDemand;
	private String serviceLevel;
	private String supplierLeadTime;
	private String stockLevel;

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}


	public int getAvailableInventory() {
		return availableInventory;
	}

	public void setAvailableInventory(int availableInventory) {
		this.availableInventory = availableInventory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getProductAuthor() {
		return productAuthor;
	}

	public void setProductAuthor(String productAuthor) {
		this.productAuthor = productAuthor;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", productCategory='" + productCategory + '\'' +
				", productTitle='" + productTitle + '\'' +
				", productAuthor='" + productAuthor + '\'' +
				", yearOfPublication=" + yearOfPublication +
				", publisher='" + publisher + '\'' +
				", availableInventory=" + availableInventory +
				", unitPrice=" + unitPrice +
				'}';
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getProductDemand() {
		return productDemand;
	}


	public void setProductDemand(String productDemand) {
		this.productDemand = productDemand;
	}


	public String getServiceLevel() {
		return serviceLevel;
	}


	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}


	public String getSupplierLeadTime() {
		return supplierLeadTime;
	}


	public void setSupplierLeadTime(String supplierLeadTime) {
		this.supplierLeadTime = supplierLeadTime;
	}


	public String getStockLevel() {
		return stockLevel;
	}


	public void setStockLevel(String stockLevel) {
		this.stockLevel = stockLevel;
	}
}
