package com.driver;

public class F1 extends Car {

    // Correct constructor to handle 2 arguments
    public F1(String name, boolean isManual) {
        // Provide arbitrary/default values for other parameters like wheels, doors, gears, type, and seats
        super(name, 4, 2, 6, isManual, "Formula 1", 1);
    }

    public void accelerate(int rate){
        // int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /*
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        int newSpeed = getCurrentSpeed() + rate;
        if (newSpeed < 0) {
            newSpeed = 0;
        }

        if (newSpeed == 0) {
            // Stop the car, set gear as 1
            stop();
            changeGear(1);
        } else if (newSpeed > 1 && newSpeed <= 50) {
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

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
    @Override
    public int getCurrentGear() {
        return super.getCurrentGear();
    }
}
