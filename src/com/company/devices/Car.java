package com.company.devices;

public class Car extends Device {
    final String producer;
    final String model;
    final Integer yearOfProduction;
    String colour;
    Double engineVolume;
    String plates;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }
}
