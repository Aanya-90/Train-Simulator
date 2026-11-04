package com.trains.vehicles;

import com.trains.cargo.Cargo;
import com.trains.cargo.CargoType;

import java.util.Objects;

/**
 * Allows passengers to board only when their destination
 * is still ahead on the vehicle's remaining route.
 */
public class DestinationAwareBoardingStrategy implements BoardingStrategy {

    @Override
    public boolean canBoard(Cargo cargo, Itinerary itinerary) {
        Objects.requireNonNull(cargo);
        Objects.requireNonNull(itinerary);

        return cargo.getType() == CargoType.PASSENGER
                && itinerary.willVisit(cargo.getDestination());
    }
}
