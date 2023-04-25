package org.example;

import java.awt.*;

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
        System.out.println("Damaged: " + carReference.damaged);
        System.out.print("Door Count: " + carReference.doorCount);
        System.out.print("Color:" + carReference.color);
        System.out.println(carReference);

        Car car2 = new Car();
        car2.name = "Renault";
        car2.fuelLevel = 70;
        car2.totalTraveledDistance = 100;

        System.out.println("Properties of car" + car2.name);
        System.out.println("Max speed:" + car2.maxSpeed);
        System.out.print("Fuel level:" + car2.fuelLevel);
        System.out.print("Mileage:" + car2.mileage);
        System.out.println("Total Traveled Distance:" + car2.totalTraveledDistance);
        System.out.println("Damaged:" + car2.damaged);
        System.out.print("Door Count" + car2.doorCount);
        System.out.print("Color:" + car2.color);

        System.out.println("Initial name for car1:" + carReference.name);

        carReference.name = "Audi";
        System.out.println("Changed name for car1:" + carReference.name);

        carReference = new Car();
        System.out.print("Name of new car:" + carReference.name);
        carReference.name = "BMW";

        carReference = car2;

        System.out.print("Name of car referenced from 2 variables. CarReference: "+ carReference.name);
        System.out.print("Name of car referenced from 2 variables. Car2:"+car2.name);

        car2.name = "Dacia";

        System.out.print("Updated name of car referenced from 2 variables. CarReference: "+ carReference.name);
        System.out.print("Updated name of car referenced from 2 variables. Car2:"+car2.name);


        car2 = null;

        System.out.print(carReference.name);




    }
}
