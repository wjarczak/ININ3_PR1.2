package com.company.animals;

import com.company.devices.Phone;
import com.company.devices.Car;

import  java.util.Date;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public String gender;
    public Double cash;
    public Animal animal;
    public Phone phone;
    private Car Car;
    private Double lastTimeSalary;
    private Date lastTimeSalaryCheck;
    private Double salary;

    public Human(String firstName, String lastName, Double cash) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
    }


    public Double getSalary() {
        System.out.println("You checked your salary last time " + lastTimeSalaryCheck.toString() + ", it was" +lastTimeSalary);
        lastTimeSalary = salary;
        lastTimeSalaryCheck = new Date();
        return salary;
    }
    public void setSalary(Double salary){
        if (salary < 0) {
            System.out.println("You cannot set salary lower than 0... It's shame even in poland");
            return;
        }
        System.out.println("Accountant recived approve that from next month your salary rises");
        System.out.println("Grażyna will give you papers to sign in ASAP");
        System.out.println("ZUS knows everyting");
        this.salary = salary;
    }

    public Car getCar() {
        return Car;
    }

    public void setCar(Car Car) {

        if (Car == null) {
            this.Car = null;
            return;
        }
        if (this.salary > (Car.value / 12)) {
            System.out.println("No way, But there is Loan! Bought!");
            this.Car = Car;
            return;
        }

        System.out.println("Poor country, You cannot afford a car. Welcome to WSB");
        return;
    }

    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cash=" + cash +
                '}';
    }

    @Override
    public void feed(double foodWeight) {

    }

    @Override
    public void sale(String seller, String buyer, Double price) {

    }
}
