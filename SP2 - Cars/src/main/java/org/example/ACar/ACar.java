package org.example.ACar;

import org.example.Car;

public abstract class ACar implements Car {
    protected  String registrationNumber;
    protected  String make;
    protected  String model;
    protected  int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    @Override
    public String toString() {
        return "Registration Number: "+getRegistrationNumber() +
                "\nMake: "+getMake()+
                "\nModel: "+getModel()+
                "\nNumber of doors: "+getNumberOfDoors();
    }
}