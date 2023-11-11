package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    private final ArrayList<Car> fleet;

    public FleetOfCars(){
        this.fleet = new ArrayList<>();
    }
    public void addCar(Car car){
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for (Car car : fleet) {
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    @Override
    public String toString(){
        StringBuilder cars = new StringBuilder();
        for(Car car : fleet){
            cars.append(car.toString()).append("\n");
        }
        return cars.toString();
    }
}