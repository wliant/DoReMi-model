package com.thesundaylunatics.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="tb_customer")
public class Customer {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	private boolean isCorporate;
	private String creditRisk;
	private String name;
	private String address;
	private Date dateRegistered;
	private boolean latePayment;
	private boolean defaulter;
	private boolean isNew;
	private int yearsActive;
	private Double ltv;
	private String frequencyOfPurchase;

	@ManyToOne(cascade = {CascadeType.ALL }, fetch = FetchType.EAGER)
	private FinancialIndicator financialIndicator;

    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", isCorporate=" + isCorporate +
				", creditRisk='" + creditRisk + '\'' +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", dateRegistered=" + dateRegistered +
				", latePayment=" + latePayment +
				", defaulter=" + defaulter +
				", isNew=" + isNew +
				", yearsActive=" + yearsActive +
				", ltv=" + ltv +
				", frequencyOfPurchase='" + frequencyOfPurchase + '\'' +
				", financialIndicator=" + financialIndicator +
				'}';
	}

	public boolean isCorporate() {
		return isCorporate;
	}

	public void setCorporate(boolean corporate) {
		isCorporate = corporate;
	}

	public String getCreditRisk() {
		return creditRisk;
	}

	public void setCreditRisk(String creditRisk) {
		this.creditRisk = creditRisk;
	}

	public boolean isDefaulter() {
		return defaulter;
	}

	public void setDefaulter(boolean defaulter) {
		this.defaulter = defaulter;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean aNew) {
		isNew = aNew;
	}

	public int getYearsActive() {
		return yearsActive;
	}

	public void setYearsActive(int yearsActive) {
		this.yearsActive = yearsActive;
	}

	public Double getLtv() {
		return ltv;
	}

	public void setLtv(Double ltv) {
		this.ltv = ltv;
	}

	public String getFrequencyOfPurchase() {
		return frequencyOfPurchase;
	}

	public void setFrequencyOfPurchase(String frequencyOfPurchase) {
		this.frequencyOfPurchase = frequencyOfPurchase;
	}

	public FinancialIndicator getFinancialIndicator() {
		return financialIndicator;
	}

	public void setFinancialIndicator(FinancialIndicator financialIndicator) {
		this.financialIndicator = financialIndicator;
	}

	public Date getDateRegistered() {
		return dateRegistered;
	}



	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}



	public boolean isLatePayment() {
		return latePayment;
	}



	public void setLatePayment(boolean latePayment) {
		this.latePayment = latePayment;
	}

}