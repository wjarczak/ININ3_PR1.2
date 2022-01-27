package com.company.devices;

import com.company.Application;
import com.company.animals.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Device {
    public final Integer ramSize;
    public final Integer imei;
    static final URL defaultAppServer = "krulestwo.wojciech.pl";
    private static final String defaultAppVersion = "latest";+

    public Phone(String producer, String model, Integer yearOfProduction,String colour, Integer ramSize, Integer imei, Double value) {
        super(producer, model, yearOfProduction, colour, value);
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

    public void installAnApp(String appName) {
        System.out.println("Installing APP from name: " + appName);
        this.installAnApp(appName, defaultAppServer);
    }
    public void installAnApp(String appName, Double version) {
        System.out.println("Installing APP from name: " + appName + " version: " + version);
        this.installAnApp(appName, version, defaultAppServer);
    }
    public void installAnApp(String appName,String version, String serveraddr) {
        System.out.println("Installing APP from name: " + appName + " version: " + version + "from server: " + serveraddr);

        try {
            URL url = new URL("https", serveraddr, 443, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            System.out.println("Cannot install APP" + appName);
            e.printStackTrace();
        }

    }
    public void installAnApp(Application app, Human owner) {
        if owner.phone != this){
            System.out.println("Please return phone to owner");
        } else{
            System.out.println("Owner cash: " + owner.cash + " app price: " + app.price);
            if (owner.cash < app.price) {
                System.out.println("Not this time. You don't have enought money to buy this app");
            } else {
                this.apps.add(app);
                owner.cash = owner.cash - app.price;
                System.out.println("App: " + app.appName + " insalled ");
            }
        }
    }

    public void installAnApp(URL url) {
            System.out.println("Checking destination url");
            System.out.println("Checking APP size");
            System.out.println("Checking avilable space on phone");
            System.out.println("Payment");
            System.out.println("Downloading");
            System.out.println("Unpacking");
            System.out.println("Intallation");
            System.out.println("Intallation");
        }
    }
    public void installAnApp(List<String> appNames) {
        System.out.println("Install APP form list");
        for (String appName : appNames) {
            this.installAnApp(appName, defaultAppServer);
        }
    }

    public boolean appIsInstalled(Application appName) {
        System.out.println("App already installed on phone");
        return true;
    }
    public void allFreeApps() {
        System.out.println("List of free apps:");
        int counter = 0;
        for (Application app:apps) {
            if)app.price == 0.0) {
                System.out.println("1. " + app);
                counter += 1;
            }
        }
    }
    public Double valueInstalledApps(){
        double value = 0.0;
        for (Application app:apps) {
            if(app.appIsInstalled){
                value += app.price;
            }
        }
        return value;
    }
    public ArrayList<Application> getAppsAlphabetucal() {
        ArrayList<Application> list = new ArrayList<>(this.apps);
        return list;
    }
    public ArrayList<Application> getAppsByPriceAsc() {
        ArrayList<Application> list = new ArrayList<>(this.apps);
        return list;
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