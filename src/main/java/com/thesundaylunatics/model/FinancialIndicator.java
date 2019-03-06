package com.thesundaylunatics.model;

import javax.persistence.*;

@Entity
@Table(name="tb_financialindicator")
public class FinancialIndicator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

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

	private Double totalLoans;
	private Double totalDeposits;
	private Double securities;
	private Double netSales;
	private Double tootalAssets;
    private Double cashAndCashEquivalents;
	private Double inventories;
	private Double currentLiabilities;
	private Double currentAssets;
	private Double totalRevenue;
	private Double netProfit;
	private Double totalEquity;
	private Double totalDebt;
	private Double devidends;
	private Double netIncome;

    @Override
    public String toString() {
        return "FinancialIndicator{" +
                "id=" + id +
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

    public Double getTotalLoans() {
        return totalLoans;
    }

    public void setTotalLoans(Double totalLoans) {
        this.totalLoans = totalLoans;
    }

    public Double getTotalDeposits() {
        return totalDeposits;
    }

    public void setTotalDeposits(Double totalDeposits) {
        this.totalDeposits = totalDeposits;
    }

    public Double getSecurities() {
        return securities;
    }

    public void setSecurities(Double securities) {
        this.securities = securities;
    }

    public Double getNetSales() {
        return netSales;
    }

    public void setNetSales(Double netSales) {
        this.netSales = netSales;
    }

    public Double getTootalAssets() {
        return tootalAssets;
    }

    public void setTootalAssets(Double tootalAssets) {
        this.tootalAssets = tootalAssets;
    }

    public Double getCashAndCashEquivalents() {
        return cashAndCashEquivalents;
    }

    public void setCashAndCashEquivalents(Double cashAndCashEquivalents) {
        this.cashAndCashEquivalents = cashAndCashEquivalents;
    }

    public Double getInventories() {
        return inventories;
    }

    public void setInventories(Double inventories) {
        this.inventories = inventories;
    }

    public Double getCurrentLiabilities() {
        return currentLiabilities;
    }

    public void setCurrentLiabilities(Double currentLiabilities) {
        this.currentLiabilities = currentLiabilities;
    }

    public Double getCurrentAssets() {
        return currentAssets;
    }

    public void setCurrentAssets(Double currentAssets) {
        this.currentAssets = currentAssets;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Double getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(Double netProfit) {
        this.netProfit = netProfit;
    }

    public Double getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(Double totalEquity) {
        this.totalEquity = totalEquity;
    }

    public Double getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(Double totalDebt) {
        this.totalDebt = totalDebt;
    }

    public Double getDevidends() {
        return devidends;
    }

    public void setDevidends(Double devidends) {
        this.devidends = devidends;
    }

    public Double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(Double netIncome) {
        this.netIncome = netIncome;
    }

}
