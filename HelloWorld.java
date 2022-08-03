package com.example.helloworld;


//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String[][] names = {
                {"Narmin", "leyla"},
                {"Vahid", "Musa", "Ahmed"}
        };

        for(int i=0; i < names.length; i++){
            for (int j=0; j<names[i].length; j++){
                System.out.println("here is "+ names[i][j]);
            }
        }
//
        ArrayList<String> arrnames = new ArrayList<String>();
        arrnames.add("Nara");
        arrnames.add("Leila");
        arrnames.add("Nargus");
        for (int i=0; i<arrnames.size(); i++){
            System.out.println(arrnames.get(i));
        }
        String[] animal = {"cat", "dog", "mice"};

        for (String i : animal){
            System.out.println(i);
        }
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("snake");
        for (String i: animals){
            System.out.println(i);
        }
        String gender;
        Scanner scanner = new Scanner(System.in);
        gender = scanner.nextLine();
        if (gender.contains("'")){
            gender = gender.replace("'", "''");
            System.out.println(gender + " replace string ");
        }else{
            gender = "%"+ gender +"%";
            System.out.println(gender + " percentage");
        }
//
        System.out.println(gender);
        Person narmin = new Person("Narmin", 25, "Female", 53.00);
        Person nargiz = new Person("Nargiz", 28, "Female", 56.00);
//
        narmin.born();
        System.out.println(narmin.feature);
        System.out.println(narmin.weight);
        narmin.features();
        System.out.println(narmin.feature);
//        System.out.println(nargiz.eyes);

//        narmin.die();
//        narmin.die();
        Person nara = new Person("nara", 22, "f", 32.00);
        String val = nara.die(6,7);
        System.out.println(val);
        //Arrays
        int[] ages = {21,23,24,25,31};
        int[] numbers = new int[5];
        for(int i=0; i<ages.length; i++){
            numbers[i] = ages[i];

            System.out.println(numbers[i]);
        }
        Food[] grocery = new Food[3];
        Food food1 = new Food("yogurt");
        Food food2 = new Food("crud");
        Food food3 = new Food("milk");
        grocery[0] = food1;
        grocery[1] = food2;
        grocery[2] = food3;

        for (int i=0; i< grocery.length; i++){
            System.out.println(grocery[i].name);
        }
//        // Arraylist
        ArrayList<Food> refrigerator = new ArrayList<Food>();

        for (int i=0; i< grocery.length;i++){
            refrigerator.add(grocery[i]);

        }
        System.out.println(refrigerator.get(0).name);
        if (refrigerator.get(0) == grocery[0]){
            System.out.println("they are equal");
        }
        //object passing
        Garage garage = new Garage();
        Car car = new Car("BMW", "X6", 2019);
        System.out.println(car.getMake());
        garage.park(car);
        System.out.println(Garage.carsingarage);
        System.out.println(".......1");
        garage.park(car);
        System.out.println(Garage.carsingarage);
        System.out.println("......2");
        // copy objects
        Car car1 = new Car("BMW", "X6", 2019);
        Car car2 = new Car("BMW", "X5", 2012);
//        System.out.println(car1.getMake());
        Car car3 = new Car("audio", "latest", 2022);
        System.out.println(car3.toString());

        car1.setMake("Mercedes");
        System.out.println(car1.getMake());
        System.out.println(Car.carCount);
        System.out.println(car1.toString());
        //interfaces

    }
}


