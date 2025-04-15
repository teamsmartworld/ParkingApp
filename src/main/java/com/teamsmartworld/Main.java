package com.teamsmartworld;



import com.teamsmartworld.model.Customer;
import com.teamsmartworld.model.ParkingSpot;
import com.teamsmartworld.model.Reservation;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "CustomerName1", "0123456789", "ABC-123");
        ParkingSpot spot1 = new ParkingSpot (1, 101);
        System.out.println("spot1 = " + spot1);

        Reservation reservation1 = new Reservation(customer, spot1, 2);
        System.out.println(reservation1);
    }
}
