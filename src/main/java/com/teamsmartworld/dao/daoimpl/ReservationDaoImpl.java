package com.teamsmartworld.dao.daoimpl;

import com.teamsmartworld.dao.ReservationDao;
import com.teamsmartworld.model.Reservation;

import java.util.ArrayList;
import java.util.Optional;

public class ReservationDaoImpl implements ReservationDao {

    private ArrayList<Reservation > inMemoryStorage = new ArrayList<>();

    @Override
    public Reservation save(Reservation reservation) {
        //todo needs completion
        return null;
    }

    @Override
    public Optional<Reservation> findById(String id) {
        //todo needs completion
        return Optional.empty();
    }

    @Override
    public void update(Reservation reservation) {
        //todo needs completion

    }
}
