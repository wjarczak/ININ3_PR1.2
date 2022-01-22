package com.company.animals;

import com.company.devices.Phone;
import com.company.devices.Car;
import java.io.PrintStream;
import java.util.Date;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    public String gender;
    public Double cash;
    public Animal animal;
    public Phone phone;
    public Car[] garage;
    private Double lastTimeSalary;
    private Date lastTimeSalaryCheck;
    private Double salary;
    private int defGarageSize = 2;

    public Human(String firstName, String lastName, Double cash) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.garage= new Car[defGarageSize];
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

    public Car getCar(int park) {
        if (park >= garage.length) {
            System.out.println("No more space in garage");
        }
        if (park < 0) {
            System.out.println("Soooo.... What now?");
        }
        return garage[];
    }

    public void setCar(Car Car, int park) {
        if (park < this.garage.length && park >= 0) {
            if (this.garage[park] != null && Car != null) {
                System.out.println("There is already a car. Do something with that");
            }

            if (Car == null) {
                this.garage[park] = null;
            } else if (this.salary > Car.value) {
                System.out.println("WOW! Bought!");
                this.garage[park] = Car;
                Car.previousOwners.add(this);
            } else if (this.salary > (Car.value / 12.0)) {
                System.out.println("Bought!... On loan");
                this.garage[park] = Car;
            } else {
                System.out.println("Poor country. Welcome to WSB");
            }
        } else {
            System.out.println("Try again later");
        }
    }
    public int CheckIfHaveCar(Car car) {
        for(int i = 0; i < this.garage.length; ++i) {
            if (this.garage[i] == car) {
                return i;
            }
        }
        return -1;
    }

    public int CheckIfHaveFreeSlot() {
        for(int i = 0; i < this.garage.length; ++i) {
            if (this.garage[i] == null) {
                return i;
            }
        }
        return -1;
    }
    public Double getGarageValue() {
        double sum = 0.0;
        for(Car c : garage) {
            sum += c.value;
        }
        return sum;
    }
    public void sortCarsByProdYear() {
        for(int i = 0; i<garage.length-1; i++) {
            if (garage[i] != null && garage[i+1] != null) {
                var a = garage[i];
                var b = garage[i+1];

                if(a.getYearOfProduction() > b.getYearOfProduction()) {
                    garage[i] = b;
                    garage[i+1] = a;
                }
            }
        }

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
