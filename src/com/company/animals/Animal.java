package com.company.animals;

import com.company.Saleable;

public abstract class Animal implements Saleable, Feedable {
    final static Double DEFAULT_CAT_WEIGHT = 2.0;
    public final static Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_WEIGHT = 1.0;
    final String species;
    Double weight;
    String name;
    Boolean isAlive;

    public Animal(String species, Double weight, String name, boolean isAlive) {
        this.isAlive = true;
        this.species = species;

        switch(species) {
            case "homo sapiens":
                this.weight = 100.0;
                break;
            case "dog":
                this.weight = 15.0;
                break;
            case "cat":
                this.weight = 5.0;
                break;
            default:
                this.weight = 2.0;
                break;
        }
    }


    public void feed() {
        if (this.isAlive) {
            this.weight += 1;
            System.out.println("thx for food bro");
        } else {
            System.out.println("too late, sorry");
        }
    }

    @Override
    public void feed(double foodWeight) {

    }

    void takeForAWalk() {
        if (this.isAlive) {
            this.weight -= 1;
            System.out.println("nice walk xD");
            if (this.weight <= 0) {
                this.isAlive = false;
            }
        } else {
            System.out.println("POLICE!!! THERE IS DEAD ANIMAL HERE");
        }
    }

    @Override
    public void sale(String seller, String buyer, Double price) {
        if(this instanceof Human) {
            System.out.println("Cannot sell humans, not in this century");
            return;
        }

        if(!(seller.animal == this)) {
            System.out.println("Cannot sell animat that U don't own");
            return;
        }

        if(buyer.cash < price) {
            System.out.println("Poor buyer - can't buy animal");
            return;
        }

        seller.animal = null;
        buyer.animal = this;

        buyer.cash += price;
        seller.cash -= price;

        System.out.println(seller.firstName + " sold animal to " + buyer.firstName);
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }
}