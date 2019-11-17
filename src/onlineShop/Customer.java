package onlineShop;

import java.util.ArrayList;

public class Customer {

    private String id;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    private ArrayList<Invoice> invoices = new ArrayList<>();

    public Customer(String id, String address, String phoneNumber, String emailAddress) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this.id = id;
        this.address = address;
        phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    //todo

}
