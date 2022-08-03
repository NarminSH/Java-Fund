package com.example.helloworld;

public class Vehicle {
    String name;
    String model;

    Vehicle(String make, String model){
        this.name = make;
        this.model = model;
    }
    public String toString(){
        return this.name + "\n" + this.model;
    }
}
