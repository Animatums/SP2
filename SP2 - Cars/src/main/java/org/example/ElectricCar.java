package org.example;

public class ElectricCar {
    private final int batteryCapacity;
    private final int maxRange;
    private final double WhPrKm;

    ElectricCar(String registrationNumber, String make,String model, int numberOfDoors,  int batteryCapacity, int maxRange){
        super();
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.WhPrKm = 100/(batteryCapacity/91.25);
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return maxRange;
    }
    public double getWhPrKm(){
        return WhPrKm;
    }
    public int getRegistrationFee(){
        int registrationFee = 0;
        if(WhPrKm >= 20 && WhPrKm < 50){
            registrationFee = 330;
        } else if(WhPrKm > 15 && WhPrKm < 20){
            registrationFee = 1050;
        } else if(WhPrKm >= 10 && WhPrKm <= 15){
            registrationFee = 2340;
        } else if(WhPrKm > 5 && WhPrKm < 10){
            registrationFee = 5500;
        } else if(WhPrKm <= 5){
            registrationFee = 10470;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "\n" + super.toString() +
                "\nWh per km: "+getWhPrKm() +
                "\nRegistration Fee: "+getRegistrationFee() + " DKK";


    }
}