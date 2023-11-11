package org.example;

public class GasolineCar extends AFuelCar{


    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre){
        super(registrationNumber,make,model,numberOfDoors,kmPrLitre);
    }
    @Override
    public String getFuelType() {
        return "Gasoline";
    }


    /* Den har markeret det nedenstående med grønt, men vil ikke fremvise hvad problemet er,
       hvilket giver rynker i panden..   */
    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;
        if(kmPrLitre >= 20 && kmPrLitre < 50){
            registrationFee = 330;
        } else if(kmPrLitre > 15 && kmPrLitre < 20){
            registrationFee = 1050;
        } else if(kmPrLitre >= 10 && kmPrLitre <= 15){
            registrationFee = 2340;
        } else if(kmPrLitre > 5 && kmPrLitre < 10){
            registrationFee = 5500;
        } else if(kmPrLitre <= 5){
            registrationFee = 10470;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return "\n" +super.toString() +
                "\nFuel type: "+getFuelType() +
                "\nLitre per km: "+getKmPrLitre() +
                "\nRegistration fee: "+getRegistrationFee() + " DKK";
    }
}