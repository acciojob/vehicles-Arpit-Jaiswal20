package com.driver;

public class Boat implements WaterVehicle {
    private String name; // The name of the boat
    private int capacity; // The capacity of the boat

    // Constructor to initialize the Boat's name and capacity
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implementation of the getVehicleName method
    @Override
    public String getVehicleName() {
        return name;
    }

    // Implementation of the getVehicleCapacity method
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
