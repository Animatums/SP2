package org.example;

public abstract class AFuelCar {
    protected int kmPrLitre;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super();
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre(){
        return kmPrLitre;
    }

    public abstract int getRegistrationFee();
}