package com.example.helloworld;

public class Garage {
    static int carsingarage;
    void park(Car car){
        System.out.printf("%s is in the garage \n", car.getMake() );
        carsingarage++;
    }
}
