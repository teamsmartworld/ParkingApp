package com.teamsmartworld;



import com.teamsmartworld.dao.CustomerDao;
import com.teamsmartworld.dao.daoimpl.CustomerDaoImpl;
import com.teamsmartworld.model.Customer;
import com.teamsmartworld.model.ParkingSpot;
import com.teamsmartworld.model.Reservation;

public class Main {

    public static void main(String[] args) {
        /*
        Customer customer1 = new Customer(1, "CustomerName1", "0123456789", "ABC-123");

        ParkingSpot spot1 = new ParkingSpot (1, 101);
        ParkingSpot spot2 = new ParkingSpot (3, 101);
        System.out.println("spot2 = " + spot2);

        Reservation reservation1 = new Reservation(customer1, spot1, 2);
        System.out.println(reservation1);
        */

        CustomerDaoImpl customerDao = new CustomerDaoImpl();

        Customer customerData1 = new Customer( "CustomerName1", "0123456789", "ABC-123");
        Customer customerData2 = new Customer( "CustomerName1", "0123456789", "ABC-123");
        customerDao.save(customerData1); //1001
        customerDao.save(customerData2); //1002
    }
}
