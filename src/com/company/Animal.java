package com.company;

public class Animal {
    public final static Double DEFAULT_CAT_WEIGHT = 2.0;
    public final static Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_WEIGHT = 1.0;
    final String species;
    Double weight;
    String name;
    Boolean isAlive;
    Double feed;
    Double goForAWalk;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        if (this.species.equals("bao")) {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species.equals("mruczek")) {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_WEIGHT;
        }
    }
}