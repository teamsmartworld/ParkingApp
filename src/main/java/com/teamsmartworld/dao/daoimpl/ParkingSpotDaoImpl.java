package com.teamsmartworld.dao.daoimpl;

import com.teamsmartworld.dao.ParkingSpotDao;
import com.teamsmartworld.model.ParkingSpot;

import java.util.ArrayList;
import java.util.Optional;

public class ParkingSpotDaoImpl implements ParkingSpotDao {

    private ArrayList<ParkingSpot> inMemoryStorage = new ArrayList<>();

    //todo needs completion
    @Override
    public ParkingSpot save(ParkingSpot parkingSpot) {
        //todo needs completion
        return null;
    }

    @Override
    public ArrayList<ParkingSpot> findAll() {
        //todo needs completion
        return null;
    }

    @Override
    public ArrayList<ParkingSpot> findAllAvailable() {
        //todo needs completion
        return null;
    }

    @Override
    public Optional<ParkingSpot> findById(Integer id) {
        //todo needs completion
        return Optional.empty();
    }

    @Override
    public void update(ParkingSpot parkingSpot) {

    }

    @Override
    public void delete(Integer id) {

    }
}
