package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // Call the superclass (Car) constructor with arbitrary values for unspecified parameters
        super(name, 4, 2, 6, isManual, "F1", 1); // Arbitrary values for wheels, doors, gears, type, seats
    }

    public void accelerate(int rate) {
        // Calculate the new speed using the current speed and rate
        int newSpeed = getCurrentSpeed() + rate;

        /**
         * Adjust the gear based on the speed:
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        if (newSpeed == 0) {
            stop(); // Stop the car if the speed is 0
            changeGear(1); // Set gear to 1
        } else {
            if (newSpeed >= 1 && newSpeed <= 50) {
                changeGear(1);
            } else if (newSpeed <= 100) {
                changeGear(2);
            } else if (newSpeed <= 150) {
                changeGear(3);
            } else if (newSpeed <= 200) {
                changeGear(4);
            } else if (newSpeed <= 250) {
                changeGear(5);
            } else {
                changeGear(6);
            }

            // Update the speed and direction of the car
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
