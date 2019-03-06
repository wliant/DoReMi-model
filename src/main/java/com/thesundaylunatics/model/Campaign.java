package com.thesundaylunatics.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_campaign")
public class Campaign {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    String campaignType;
    String productCategory;
    String productTitle;
    Double discount;
    Date campaignStart;
    Date campaignEnd;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCampaignType() {
		return campaignType;
	}
	public void setCampaignType(String campaignType) {
		this.campaignType = campaignType;
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
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Date getCampaignStart() {
		return campaignStart;
	}
	public void setCampaignStart(Date campaignStart) {
		this.campaignStart = campaignStart;
	}
	public Date getCampaignEnd() {
		return campaignEnd;
	}
	public void setCampaignEnd(Date campaignEnd) {
		this.campaignEnd = campaignEnd;
	}
	
    @Override
    public String toString() {
        return "Campaign[id=" + id + "]";
    }
}
