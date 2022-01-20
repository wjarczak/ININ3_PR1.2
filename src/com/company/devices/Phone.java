package com.company.devices;

public class Phone extends Device {
    public final Integer ramSize;
    public final Long imei;

    public Phone(String producer, String model, Integer yearOfProduction, String colour, Integer ramSize, Long imei ) {
        super(producer, model, yearOfProduction, colour);
        this.ramSize = ramSize;
        this.imei = imei;
    }

    public Phone(String apple, String iPhone, String s, String producer, String model, Integer yearOfProduction, Integer ramSize, Long imei) {
        super(producer, model, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
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

    @Override
    public void turnOn() {
        System.out.println("Telefon włączony");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }