package com.company.devices;

import com.company.animals.Human;

public class Car extends Device {
    Double engineVolume;
    String plates;
    public Double value;

    public Car(String producer, String model, Integer yearOfProduction, String plates, String colour, Double engineVolume, Double value) {
        super(producer, model, yearOfProduction, colour);
        this.plates = plates;
        this.engineVolume = engineVolume;
        this.value = value;
    }

    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction + '\'' +
                ", plates=" + plates + '\'' +
                ", colour='" + colour + '\'' +
                ", engineVolume=" + engineVolume + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {

    }

    @Override
    public void turnOn() {
        System.out.println("Engine already running");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }

    @Override
    public void ok() {

    }

    @Override
    public void sale(String seller, String buyer, Double price) {

        if(!(seller.getCar() == this)) {
            System.out.println("Cannot sell car that U don't own");
            return;
        }

        if(buyer.cash < price) {
            System.out.println("Poor buyer - can't buy car");
            return;
        }

        seller.setCar(null);
        buyer.setCar(this);

        buyer.cash += price;
        seller.cash -= price;

        System.out.println(seller.firstName + " sold car to " + buyer.firstName);
    }
}
