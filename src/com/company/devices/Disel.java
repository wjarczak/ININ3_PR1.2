package com.company.devices;

public class Disel extends Car {

    public Disel(String producer, String model, Integer yearOfProduction, String plates, String colour, Double engineVolume, Double value) {
        super(producer, model, yearOfProduction, colour, value);
        this.plates = plates;
        this.engineVolume = engineVolume;
    }

    @Override
    public void refuel(){

    }
}
