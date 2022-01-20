package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public String colour;

    public Device(String producer, String model, Integer yearOfProduction, String colour) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColour() {
        return colour;
    }

    public abstract void turnOn();

    public abstract boolean isTurnedOn();

    public abstract void ok();

}
