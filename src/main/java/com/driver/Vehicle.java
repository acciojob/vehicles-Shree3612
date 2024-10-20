package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public String getName() {
        return name;
    }

    // Getter for currentSpeed
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    // Getter for currentDirection
    public int getCurrentDirection() {
        return currentDirection;
    }

    // Method to set currentSpeed (if needed)
    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){

        System.out.println("stop method called - The vehicle is stopped");
    }

}
