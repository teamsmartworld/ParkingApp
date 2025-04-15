package com.teamsmartworld;



import com.teamsmartworld.model.Customer;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "CustomerName1", "0123456789", "ABC-123");
        customer.setVehiclePlateNumber("121212121212");
        System.out.println("customer = " + customer);
    }
}
