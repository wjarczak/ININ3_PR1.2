package com.company;

public class Application {
    public String appName;
    public Double version;
    public Double price;

    public Application(String appName, Double version, Double price) {
        this.appName = appName;
        this.version = version;
        this.price = price;
    }

    public String getAppName() {
        return this.appName;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "APP name: " + appName + ", Version: " + version + ", Price: " + price + "PLN";
    }
}
