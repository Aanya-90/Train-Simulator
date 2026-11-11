package com.trains.vehicles;

import com.trains.cargo.CargoType;

import java.util.Objects;

/**
 * Provides reusable passenger boarding strategies.
 */
public final class BoardingStrategies {

    private BoardingStrategies() {
        // Utility class - prevent instantiation.
    }

    /**
     * Allows passengers to board only when their destination
     * is still ahead on the vehicle's itinerary.
     */
    public static final BoardingStrategy DESTINATION_AWARE =
            (cargo, itinerary) -> {
                Objects.requireNonNull(cargo);
                Objects.requireNonNull(itinerary);

                return cargo.getType() == CargoType.PASSENGER
                        && itinerary.willVisit(cargo.getDestination());
            };

    /**
     * Allows any passenger to board regardless of destination.
     */
    public static final BoardingStrategy PASSENGER_ONLY =
            (cargo, itinerary) -> {
                Objects.requireNonNull(cargo);
                Objects.requireNonNull(itinerary);

                return cargo.getType() == CargoType.PASSENGER;
            };
}