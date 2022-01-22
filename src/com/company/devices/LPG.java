package com.company.devices;

public class LPG extends Car {

    public LPG(String producer, String model, Integer yearOfProduction, String plates, String colour, Double engineVolume, Double value) {
        super(producer, model, yearOfProduction, colour, value);
        this.plates = plates;
        this.engineVolume = engineVolume;
        this.value = value;
    }

    @Override
    public void refuel(){

    }
}