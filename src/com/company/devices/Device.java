package com.company.devices;

import com.company.Saleable;
import com.company.animals.Human;

public abstract class Device implements Saleable {
    private Double value;
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public String colour;

    public Device(String producer, String model, Integer yearOfProduction, String colour, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.value = value;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public abstract void sale(Human seller, Human buyer, Double price);

    public abstract void turnOn();

    public abstract boolean isTurnedOn();

    public abstract void ok();

}
