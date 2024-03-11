package com.learning.core.day6;

import java.util.TreeMap;

class Car implements Comparable<Car> {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // toString method

    @Override
    public String toString() {
        return name + " " + price;
    }

    // hashCode method

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // equals method

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Car)) return false;
        Car other = (Car) obj;
        return this.name.equals(other.name);
    }

    // compareTo method

    @Override
    public int compareTo(Car other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P05 
{
    public static void main(String[] args) {
        // Creating a TreeMap to store Car details
        TreeMap<Car, Double> carMap = new TreeMap<>();

        // Adding predefined car details
        carMap.put(new Car("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car("Swift", 305000.0), 305000.0);
        carMap.put(new Car("Audi", 600100.0), 600100.0);
        carMap.put(new Car("Benz", 900000.0), 900000.0);

        // Retrieving all car details
        //System.out.println("Car Details:");
        for (Car car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}
