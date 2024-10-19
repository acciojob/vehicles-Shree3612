package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
    }
}

//F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.accelerate(-60);
//
//// Test Boat
//Boat boat = new Boat("Yacht", 50);
//        System.out.println("Boat name: " + boat.getVehicleName());
//        System.out.println("Boat capacity: " + boat.getVehicleCapacity());