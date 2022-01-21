package com.company.animals;

public class FarmAnimal extends Animal implements Edible {


    public FarmAnimal(String species, Double weight, String name, boolean isAlive) {
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
