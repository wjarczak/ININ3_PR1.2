package com.company;

import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("bao");
        Phone iPhone = new Phone("Apple", "iPhone", 2015, "Space grey", 2, 5235235235L);
        System.out.println("Producent: " + iPhone.producer);
        System.out.println("Model: " + iPhone.model);
        System.out.println("Rok produkcji " + iPhone.yearOfProduction);
        System.out.println("Kolor: " + iPhone.colour);
        System.out.println("RAM: " + iPhone.ramSize);
        System.out.println(iPhone);

        Human me = new Human();
        System.out.println(me.getSalary());
    }
}
