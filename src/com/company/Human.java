package com.company;

public class Human {
    String FirstName;
    String LastName;
    String Gender;
    private Double salary;

    public Double getSalary() {
        //sprawdzenie uprawnien
        //konwersja
        //pobranie danych z bazy
        //pobranie danych z ceche
        //dodawanie logow
        return salary;
    }
    public void setSalary(Double salary){
        //uprawnienia
        //zapisanie do bazy danych
        //przygotowanie dokumentu
        //komniunikat do innego systemu
        //zapisanie logow
        this.salary = salary;
    }

    // To samo co public void salary;
}
