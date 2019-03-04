package com.thesundaylunatics.model;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="tb_financialindicator")
public class FinancialIndicator {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@OneToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	private Customer customer;

	private boolean isNew;
	private String creditRisk;
	private String liquidity;
	private String operationAbility;
	private String debtPayingAbility;
	private String profitability;
	private String ldr;
	private String dar;
	private String sar;
	private String tat;
	private String chr;
	private String qkr;
	private String ctr;
	private String npm;
	private String roc;

	private BigDecimal totalLoans;
	private BigDecimal totalDeposits;
	private BigDecimal securities;
	private BigDecimal netSales;
	private BigDecimal tootalAssets;

    @Override
    public String toString() {
        return "FinancialIndicator{" +
                "id=" + id +
                ", customer=" + customer +
                ", isNew=" + isNew +
                ", creditRisk='" + creditRisk + '\'' +
                ", liquidity='" + liquidity + '\'' +
                ", operationAbility='" + operationAbility + '\'' +
                ", debtPayingAbility='" + debtPayingAbility + '\'' +
                ", profitability='" + profitability + '\'' +
                ", ldr='" + ldr + '\'' +
                ", dar='" + dar + '\'' +
                ", sar='" + sar + '\'' +
                ", tat='" + tat + '\'' +
                ", chr='" + chr + '\'' +
                ", qkr='" + qkr + '\'' +
                ", ctr='" + ctr + '\'' +
                ", npm='" + npm + '\'' +
                ", roc='" + roc + '\'' +
                ", totalLoans=" + totalLoans +
                ", totalDeposits=" + totalDeposits +
                ", securities=" + securities +
                ", netSales=" + netSales +
                ", tootalAssets=" + tootalAssets +
                ", cashAndCashEquivalents=" + cashAndCashEquivalents +
                ", inventories=" + inventories +
                ", currentLiabilities=" + currentLiabilities +
                ", currentAssets=" + currentAssets +
                ", totalRevenue=" + totalRevenue +
                ", netProfit=" + netProfit +
                ", totalEquity=" + totalEquity +
                ", totalDebt=" + totalDebt +
                ", devidends=" + devidends +
                ", netIncome=" + netIncome +
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

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getCreditRisk() {
        return creditRisk;
    }

    public void setCreditRisk(String creditRisk) {
        this.creditRisk = creditRisk;
    }

    public String getLiquidity() {
        return liquidity;
    }

    public void setLiquidity(String liquidity) {
        this.liquidity = liquidity;
    }

    public String getOperationAbility() {
        return operationAbility;
    }

    public void setOperationAbility(String operationAbility) {
        this.operationAbility = operationAbility;
    }

    public String getDebtPayingAbility() {
        return debtPayingAbility;
    }

    public void setDebtPayingAbility(String debtPayingAbility) {
        this.debtPayingAbility = debtPayingAbility;
    }

    public String getProfitability() {
        return profitability;
    }

    public void setProfitability(String profitability) {
        this.profitability = profitability;
    }

    public String getLdr() {
        return ldr;
    }

    public void setLdr(String ldr) {
        this.ldr = ldr;
    }

    public String getDar() {
        return dar;
    }

    public void setDar(String dar) {
        this.dar = dar;
    }

    public String getSar() {
        return sar;
    }

    public void setSar(String sar) {
        this.sar = sar;
    }

    public String getTat() {
        return tat;
    }

    public void setTat(String tat) {
        this.tat = tat;
    }

    public String getChr() {
        return chr;
    }

    public void setChr(String chr) {
        this.chr = chr;
    }

    public String getQkr() {
        return qkr;
    }

    public void setQkr(String qkr) {
        this.qkr = qkr;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getRoc() {
        return roc;
    }

    public void setRoc(String roc) {
        this.roc = roc;
    }

    public BigDecimal getTotalLoans() {
        return totalLoans;
    }

    public void setTotalLoans(BigDecimal totalLoans) {
        this.totalLoans = totalLoans;
    }

    public BigDecimal getTotalDeposits() {
        return totalDeposits;
    }

    public void setTotalDeposits(BigDecimal totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    public BigDecimal getSecurities() {
        return securities;
    }

    public void setSecurities(BigDecimal securities) {
        this.securities = securities;
    }

    public BigDecimal getNetSales() {
        return netSales;
    }

    public void setNetSales(BigDecimal netSales) {
        this.netSales = netSales;
    }

    public BigDecimal getTootalAssets() {
        return tootalAssets;
    }

    public void setTootalAssets(BigDecimal tootalAssets) {
        this.tootalAssets = tootalAssets;
    }

    public BigDecimal getCashAndCashEquivalents() {
        return cashAndCashEquivalents;
    }

    public void setCashAndCashEquivalents(BigDecimal cashAndCashEquivalents) {
        this.cashAndCashEquivalents = cashAndCashEquivalents;
    }

    public BigDecimal getInventories() {
        return inventories;
    }

    public void setInventories(BigDecimal inventories) {
        this.inventories = inventories;
    }

    public BigDecimal getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(BigDecimal currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public BigDecimal getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(BigDecimal currentAssets) {
        this.currentAssets = currentAssets;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(BigDecimal netProfit) {
        this.netProfit = netProfit;
    }

    public BigDecimal getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(BigDecimal totalEquity) {
        this.totalEquity = totalEquity;
    }

    public BigDecimal getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(BigDecimal totalDebt) {
        this.totalDebt = totalDebt;
    }

    public BigDecimal getDevidends() {
        return devidends;
    }

    public void setDevidends(BigDecimal devidends) {
        this.devidends = devidends;
    }

    public BigDecimal getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(BigDecimal netIncome) {
        this.netIncome = netIncome;
    }

    private BigDecimal cashAndCashEquivalents;
	private BigDecimal inventories;
	private BigDecimal currentLiabilities;
	private BigDecimal currentAssets;
	private BigDecimal totalRevenue;
	private BigDecimal netProfit;
	private BigDecimal totalEquity;
	private BigDecimal totalDebt;
	private BigDecimal devidends;
	private BigDecimal netIncome;


}
