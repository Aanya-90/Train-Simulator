package com.trains.vehicles;

import com.trains.cargo.Cargo;
import com.trains.cargo.CargoType;

import java.util.Objects;

/**
 * Allows any passenger cargo to board,
 * regardless of its destination.
 */
public class PassengerOnlyBoardingStrategy implements BoardingStrategy {

    @Override
    public boolean canBoard(Cargo cargo, Itinerary itinerary) {
        Objects.requireNonNull(cargo);
        Objects.requireNonNull(itinerary);

        return cargo.getType() == CargoType.PASSENGER;
    }
}