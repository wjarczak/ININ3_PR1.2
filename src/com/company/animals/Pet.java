package com.company.animals;

public class Pet extends Animal implements Edible {

    public Pet(String species, Double weight, String name, boolean isAlive) {
        super(species, weight, name, isAlive);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed(double foodWeight) {
        if(this.isAlive()) {
            this.setWeight(this.getWeight() + foodWeight);
        }
    }
}
