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
    private String imageUrl;
    private int availableInventory;
    private Double unitPrice;

	@OneToOne
	@JoinColumn(name = "supplier_id",referencedColumnName = "id")
	private Supplier supplier;

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getAvailableInventory() {
		return availableInventory;
	}

	public void setAvailableInventory(int availableInventory) {
		this.availableInventory = availableInventory;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
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
				", imageUrl='" + imageUrl + '\'' +
				", availableInventory=" + availableInventory +
				", unitPrice=" + unitPrice +
				", supplier=" + supplier +
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
}
