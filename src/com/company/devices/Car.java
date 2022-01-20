package com.company.devices;

public class Car extends Device {
    Double engineVolume;
    String plates;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction,String plates, String colour, Double engineVolume, Double value ) {
        super(producer, model, yearOfProduction, plates, colour);
        this.engineVolume = engineVolume;
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Silnik w aucie włączony");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }
