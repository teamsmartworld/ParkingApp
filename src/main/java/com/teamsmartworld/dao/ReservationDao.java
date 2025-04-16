package com.teamsmartworld.dao;

import com.teamsmartworld.model.Reservation;

import java.util.Optional;

public interface ReservationDao {

    Reservation save (Reservation reservation);

    Optional <Reservation> findById(String id);

    void update(Reservation reservation);
}
