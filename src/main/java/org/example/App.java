package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car carReference = new Car();
        carReference.name = "Ferrari";
        carReference.maxSpeed = 300;
        carReference.fuelLevel = 60;
        carReference.mileage = 12.5;
        carReference.totalTraveledDistance = 0;
        carReference.damaged = true;
        carReference.doorCount = 1;
        carReference.color = "Red";

        //concatenation
        System.out.println("Properties of car" + carReference.name);
        System.out.println("Max speed:" + carReference.maxSpeed);
        System.out.print("Fuel level:" + carReference.fuelLevel);
        System.out.print("Mileage:" + carReference.mileage);
        System.out.println("Total Traveled Distance:" + carReference.totalTraveledDistance);
        System.out.println("Damaged:" + carReference.damaged);
        System.out.print("Door Count" + carReference.doorCount);
        System.out.print("Color:" + carReference.color);
        System.out.println(carReference);
    }
}
v