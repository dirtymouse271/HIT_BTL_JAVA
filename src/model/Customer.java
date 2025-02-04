package model;

public class Customer {
    private int customer_id;
    private String customer_name;
    private String customer_phonenumber;
    private String customer_address;
    private String customer_gender;

    public Customer() {
    }

    public Customer(int customer_id, String name, String customer_phonenumber, String customer_address, String customer_gender) {
        this.customer_id = customer_id;
        this.customer_name = name;
        this.customer_phonenumber = customer_phonenumber;
        this.customer_address = customer_address;
        this.customer_gender = customer_gender;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_phonenumber() {
        return customer_phonenumber;
    }

    public void setCustomer_phonenumber(String customer_phonenumber) {
        this.customer_phonenumber = customer_phonenumber;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(String customer_gender) {
        this.customer_gender = customer_gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_phonenumber='" + customer_phonenumber + '\'' +
                ", customer_address='" + customer_address + '\'' +
                ", customer_gender='" + customer_gender + '\'' +
                '}';
    }
}
