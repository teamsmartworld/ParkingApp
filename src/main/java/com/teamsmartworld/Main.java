package com.teamsmartworld;



import com.teamsmartworld.model.Customer;
import com.teamsmartworld.model.ParkingSpot;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "CustomerName1", "0123456789", "ABC-123");
        customer.setVehiclePlateNumber("121212121212");
        System.out.println("customer = " + customer);

        ParkingSpot spot1 = new ParkingSpot (1, 101);
        spot1.occupy();
        System.out.println("spot1 = " + spot1);
        spot1.vacate();
        System.out.println("spot1 = " + spot1);
    }
}
