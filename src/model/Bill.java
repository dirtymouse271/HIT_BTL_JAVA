package model;

import java.util.Date;

public class Bill {
    private int bill_id;
    private int booking_id;
    private int customer_id;
    private double totalPrice;
    private double discount;
    private double finalPrice;
    private String paymentMethod;
    private Date issueDate;
    private Date createDate;
    private Date updateDate;

    public Bill() {
    }

    public Bill(int bill_id, int booking_id, int customer_id, double totalPrice, double discount, double finalPrice, String paymentMethod, Date issueDate, Date createDate, Date updateDate) {
        this.bill_id = bill_id;
        this.booking_id = booking_id;
        this.customer_id = customer_id;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.finalPrice = finalPrice;
        this.paymentMethod = paymentMethod;
        this.issueDate = issueDate;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public int getBill_id() {
        return bill_id;
    }

    public void setBill_id(int bill_id) {
        this.bill_id = bill_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "bill_id=" + bill_id +
                ", booking_id=" + booking_id +
                ", customer_id=" + customer_id +
                ", totalPrice=" + totalPrice +
                ", discount=" + discount +
                ", finalPrice=" + finalPrice +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", issueDate=" + issueDate +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
