package com.trains.vehicles;

import com.trains.cargo.Cargo;

/**
 * Defines a strategy for deciding whether cargo is eligible
 * to board a vehicle.
 */
public interface BoardingStrategy {

    boolean canBoard(Cargo cargo, Itinerary itinerary);
}