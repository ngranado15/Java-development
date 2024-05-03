package com.pluralsight;

public class Ledger {

   private double depositAmount;
    private String dateStr;
    private String depositTime;
    private String depositDescription;
    private String depositVendor;
    private String depositInfo;
    private double paymentAmount;
    private String datePayment;
    private String paymentTime;
    private String paymentDescription;
    private String paymentVendor;
    private String paymentInfo;

    public Ledger(double depositAmount, String dateStr, String depositTime, String depositDescription, String depositVendor, String depositInfo, double paymentAmount, String datePayment, String paymentTime, String paymentDescription, String paymentVendor, String paymentInfo) {
        this.depositAmount = depositAmount;
        this.dateStr = dateStr;
        this.depositTime = depositTime;
        this.depositDescription = depositDescription;
        this.depositVendor = depositVendor;
        this.depositInfo = depositInfo;
        this.paymentAmount = paymentAmount;
        this.datePayment = datePayment;
        this.paymentTime = paymentTime;
        this.paymentDescription = paymentDescription;
        this.paymentVendor = paymentVendor;
        this.paymentInfo = paymentInfo;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(String depositTime) {
        this.depositTime = depositTime;
    }

    public String getDepositDescription() {
        return depositDescription;
    }

    public void setDepositDescription(String depositDescription) {
        this.depositDescription = depositDescription;
    }

    public String getDepositVendor() {
        return depositVendor;
    }

    public void setDepositVendor(String depositVendor) {
        this.depositVendor = depositVendor;
    }

    public String getDepositInfo() {
        return depositInfo;
    }

    public void setDepositInfo(String depositInfo) {
        this.depositInfo = depositInfo;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(String datePayment) {
        this.datePayment = datePayment;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getPaymentDescription() {
        return paymentDescription;
    }

    public void setPaymentDescription(String paymentDescription) {
        this.paymentDescription = paymentDescription;
    }

    public String getPaymentVendor() {
        return paymentVendor;
    }

    public void setPaymentVendor(String paymentVendor) {
        this.paymentVendor = paymentVendor;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }





}
