package com.company.devices;

import com.company.animals.Human;

import java.util.ArrayList;

public abstract class Car extends Device {
    Double engineVolume;
    String plates;
    public Double value;
    public ArrayList<Human> previousOwners = new ArrayList<>();

    public Car(String producer, String model, Integer yearOfProduction, String plates, String colour, Double engineVolume, Double value) {
        super(producer, model, yearOfProduction, colour, value);
        this.plates = plates;
        this.engineVolume = engineVolume;
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

    public abstract void refuel();

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

    public void sale(Human seller, Human buyer, Double price) {
        int sellerCarSlot = seller.CheckIfHaveCar(this);
        if (sellerCarSlot < 0) {
            System.out.println("Cannot sell car that U don't own");
        } else if (buyer.cash < price) {
            System.out.println("Poor buyer - can't buy car");
        } else {
            int buyerFreeSlot = buyer.CheckIfHaveFreeSlot();
            if (buyerFreeSlot < 0) {
                System.out.println("Buyer has 0 free places in parking lot");
            } else {
                if (this.previousOwners.size() > 0 && this.previousOwners.get(this.previousOwners.size() - 1) != buyer) {
                    System.out.println("Seller isn't owner");
                }
                seller.setCar((Car)null, sellerCarSlot);
                buyer.setCar(this, buyerFreeSlot);
                buyer.cash = buyer.cash - price;
                seller.cash = seller.cash + price;
                System.out.println(seller.firstName + " sold car to " + buyer.firstName);
                this.previousOwners.add(buyer);
            }
        }
    }

    public boolean checkIfHumanHaveThisCar(Human human) {
        for(int i = 0; i < this.previousOwners.size(); ++i) {
            if (this.previousOwners.get(i) == human) {
                System.out.println("User had this car before");
                return true;
            }
        }
        return false;
    }

    public boolean checkIfTransactionWasMAde(Human a, Human b) {
        for(int i = 0; i < this.previousOwners.size(); ++i) {
            if (this.previousOwners.get(i) == a && this.previousOwners.get(i + 1) == b) {
                System.out.println("Transaction was made between two of them");
                return true;
            }
        }
        return false;
    }
}
