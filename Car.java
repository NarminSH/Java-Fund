package com.example.helloworld;

public class Car extends Vehicle{
    private String make;
    private String model;
    private int year;

    static int carCount;

    Car(String make, String model, int year){
        super(make, model);
//        this.setMake(make);
//        this.setModel(model);
        this.setYear(year);
        carCount ++;
    }
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCarCount() {
        return carCount;
    }

//    @Override
//    public String toString() {
//        return super.toString() ;
//    }
}
