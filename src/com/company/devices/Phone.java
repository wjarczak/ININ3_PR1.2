package com.company.devices;

import com.company.animals.Human;

public class Phone extends Device {
    public final Integer ramSize;
    public final Integer imei;

    public Phone(String producer, String model, Integer yearOfProduction,String colour, Integer ramSize, Integer imei) {
        super(producer, model, yearOfProduction, colour);
        this.ramSize = ramSize;
        this.imei = imei;
    }

    public String getRamSize(){
        return this.ramSize +"GB";
    }


    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", colour='" + colour + '\'' +
                ", ramSize=" + ramSize +
                ", imei=" + imei +
                '}';
    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {

        if(!(seller.phone == this)) {
            System.out.println("Cannot sell phone that U don't own");
            return;
        }

        if(buyer.cash < price) {
            System.out.println("Poor buyer - can't buy phone");
            return;
        }

        seller.phone = null;
        buyer.phone = this;

        buyer.cash += price;
        seller.cash -= price;

        System.out.println(seller.firstName + " sold phone to " + buyer.firstName);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is ON");
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

    }
}