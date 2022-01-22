package com.company.devices;

public class Electric extends Car {

    public Electric(String producer, String model, Integer yearOfProduction, String plates, String colour, Double engineVolume, Double value) {
        super(producer, model, yearOfProduction, colour, value);
        this.plates = plates;
        this.value = value;
    }

    @Override
    public void refuel(){

    }
}
