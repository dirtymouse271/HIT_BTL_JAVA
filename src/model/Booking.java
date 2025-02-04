package model;

import java.util.Date;

public class Booking {
    private int booking_id;
    private int room_id;
    private int customer_id;
    private Date checkInDate;
    private Date checkOutDate;
    private int numberOfGuest;
    private Status status;
    private double totalPrice;
    private Date createDate;
    private Date updateDate;
    private String paymentMethod;
    public Booking() {
    }

    public Booking(int booking_id, int room_id, int customer_id, Date checkInDate, Date checkOutDate, int numberOfGuest, Status status, double totalPrice, Date createDate, Date updateDate, String paymentMethod) {
        this.booking_id = booking_id;
        this.room_id = room_id;
        this.customer_id = customer_id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfGuest = numberOfGuest;
        this.status = status;
        this.totalPrice = totalPrice;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.paymentMethod = paymentMethod;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", room_id=" + room_id +
                ", customer_id=" + customer_id +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", numberOfGuest=" + numberOfGuest +
                ", status=" + status +
                ", totalPrice=" + totalPrice +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
