package com.thesundaylunatics.model;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_productinventory")
public class ProductInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@OneToOne
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private Product product;

	private String productDemand;
	private String serviceLevel;
	private String supplierLeadTime;
	private String stockLevel;
	private String inventoryDecision;
	private DateTime lastModified;

    @Override
    public String toString() {
        return "ProductInventory{" +
                "id=" + id +
                ", product=" + product +
                ", productDemand='" + productDemand + '\'' +
                ", serviceLevel='" + serviceLevel + '\'' +
                ", supplierLeadTime='" + supplierLeadTime + '\'' +
                ", stockLevel='" + stockLevel + '\'' +
                ", inventoryDecision='" + inventoryDecision + '\'' +
                ", lastModified=" + lastModified +
                '}';
    }

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

    public String getInventoryDecision() {
        return inventoryDecision;
    }

    public void setInventoryDecision(String inventoryDecision) {
        this.inventoryDecision = inventoryDecision;
    }

    public DateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(DateTime lastModified) {
        this.lastModified = lastModified;
    }
}
