package com.teamsmartworld.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    //TO BE COMPLETED

    //Fields
    private Integer id;
    private String name;
    private String phoneNumber;
    private String vehiclePlateNumber;

    //Constructors

    public Customer(Integer id, String name, String phoneNumber, String vehiclePlateNumber) {
        setId(id);
        setName(name);
        setPhoneNumber(phoneNumber);
        setVehiclePlateNumber(vehiclePlateNumber);
    }

    public Customer(String name, String phoneNumber, String vehiclePlateNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    //Methods (Getters, setters, toString. more...

    public void setId(Integer id) {
        if(id == null) throw new IllegalArgumentException("ID cannot be null");
        this.id = id;
    }

    public void setName(String name) {
        if(name == null) throw new IllegalArgumentException("Name cannot be null");
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()){
            throw new IllegalArgumentException("Phone Number cannot be null or Empty");
        }

        final String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("9876543210");
        if (!matcher.matches()) throw new IllegalArgumentException("Invalid Phone Number");
        this.phoneNumber = phoneNumber;

    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        if(vehiclePlateNumber == null) throw new IllegalArgumentException("Vehicle Plate Number cannot be null");
        this.vehiclePlateNumber = vehiclePlateNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehiclePlateNumber='" + vehiclePlateNumber + '\'' +
                '}';
    }
}
