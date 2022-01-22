package com.company;

import com.company.animals.Human;
import com.company.animals.Animal;
import com.company.animals.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Disel;
import com.company.devices.Electric;
import com.company.devices.LPG;

public class Main {

    public static void main(String[] args) {

        Animal dog1 = new Pet("dog", 20.0, "Reksio", true);
        Animal dog2 = new Pet("dog", 25.0, "Amik", true);

        Car fiat = new LPG("Fiat", "Bravo", 2016, "GD12345", "grey", 2500.0, 15000.0);
        Car passerati = new Disel("VW", "Passat", 2004, "GA54321", "black", 1999.0, 25000.0);
        Car tesla = new Electric("Tesla", "S", 2020, "GDT3SLA", "white", null, 100000.0);
        Car punto = new LPG("Fiat", "Punto", 2013, "GSZ033KL", "silver", 1400.0, 25000.0);
        Car W124 = new Disel("Mercedes", "W124", 1998, "GA762WS", "black", 2500.0, 10000.0);
    //    fiat.turnOn();
    //    passerati.turnOn();

        fiat.refuel();

        Phone iphone = new Phone("Apple", "S", 2015, "Space grey", 3, 1231253245);
        Phone xiaomi = new Phone("xiaomi", "mi8", 2018, "Black", 8, 543534513);
    //    iphone.turnOn();

        Human human1 = new Human("Wojciech", "Jarczak", 8000.0);
        Human human2 = new Human("Andrzej", "Nowak", 4000.0);
        Human human3 = new Human("Kamika", "Agata", 5000.0);

        human1.animal = dog1;
        human1.phone = iphone;

        human2.animal = dog2;
        human2.phone = xiaomi;

        human1.setSalary(8000.0);
        human1.setCar(passerati);

        human2.setSalary(4000.0);
        human2.setCar(fiat);

        human3.setSalary(5000.0);
        human3.setCar(tesla);

        passerati.sale("human1", "human2", 15000.0);
        human1.sale("human1", "human2", 2.0);
    }
}