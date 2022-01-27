package com.company;

import com.company.animals.*;
import com.company.devices.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

/*        Animal dog1 = new Pet("dog", 20.0, "Reksio", true);
        Animal dog2 = new Pet("dog", 25.0, "Amik", true);*/

        Car fiat = new LPG("Fiat", "Bravo", 2016, "GD12345", "grey", 2500.0, 15000.0);
        Car passerati = new Disel("VW", "Passat", 2004, "GA54321", "black", 1999.0, 25000.0);
        Car tesla = new Electric("Tesla", "S", 2020, "GDT3SLA", "white", null, 100000.0);
        Car punto = new LPG("Fiat", "Punto", 2013, "GSZ033KL", "silver", 1400.0, 25000.0);
        Car W124 = new Disel("Mercedes", "W124", 1998, "GA762WS", "black", 2500.0, 10000.0);
    //    fiat.turnOn();
    //    passerati.turnOn();

        fiat.refuel();

        Phone iphone = new Phone("Apple", "S", 2015, "Space grey", 3, 1231253245, 1500.0);
        Phone xiaomi = new Phone("xiaomi", "mi8", 2018, "Black", 8, 543534513, 500.0);
    //    iphone.turnOn();

        Human human1 = new Human("Wojciech", "Jarczak", 8000.0);
        Human human2 = new Human("Andrzej", "Nowak", 4000.0);
        Human human3 = new Human("Kamika", "Agata", 5000.0);

    //    human1.animal = dog1;
        human1.phone = iphone;

    //    human2.animal = dog2;
        human2.phone = xiaomi;

        human1.setSalary(8000.0);
        human1.setCar(passerati, 0);

        human2.setSalary(4000.0);
        human2.setCar(fiat, 1);

        human3.setSalary(5000.0);
        human3.setCar(tesla, 2);

        passerati.checkIfHumanHaveThisCar(human1);
        passerati.checkIfTransactionWasMAde(human1, human2);

        passerati.sale("human1", "human2", 15000.0);
        human1.sale("human1", "human2", 2.0);

        Application app1 = new Application("mBank", 1.2D, 500.0D);
        Application app2 = new Application("AliorBank", 0.5D, 50.0D);
        Application app3 = new Application("PKO", 5.2D, 550.0D);
        Application app4 = new Application("YouTube", 1.5D, 505.0D);

        iphone.installAnApp("app1", human1);
        iphone.installAnApp("app2", human2);
        iphone.installAnApp("app3", human1);
        ArrayList<Application> ByAlph = iphone.getAppsAlphabetucal();
        ArrayList<Application> ByPrice = iphone.getAppsByPriceAsc();
    }
}