package org.example;

public class Main {

    /* Jeg er gået helt i stå her, er stødt på den gentagelse af et problem:
        "Casting 'new GasolineCar(...)' to 'Car' will produce 'ClassCastException' for any non-null value",
       Hvilket jeg prøver, at finde en løsning på, men den skriver bare:
        "Unable to find cause".. */

    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();
        Car gasCar1 = (Car) new GasolineCar("HJ48271","Audi","A4",4,12);
        fleet.addCar(gasCar1);
        Car gasCar2 = (Car) new GasolineCar("MT37219","Audi","A8",4,500);
        fleet.addCar(gasCar2);

        Car electCar1 = (Car) new ElectricCar("LU48129","Tesla","Z",2,400,6);
        fleet.addCar(electCar1);
        Car electCar2 = (Car) new ElectricCar("TK92412","Tesla","X",2,200,6);
        fleet.addCar(electCar2);

        Car dieselCar1 = (Car) new DieselCar("NF84912","Mercedes","E",4,11,true);
        fleet.addCar(dieselCar1);
        Car dieselCar2 = (Car) new DieselCar("LC85419","Mercedes","B",4,13,false);
        fleet.addCar(dieselCar2);

        System.out.println(fleet);

        System.out.println("Total Registration Fee for fleet: " + fleet.getTotalRegistrationFeeForFleet() + " DKK");
    }
}