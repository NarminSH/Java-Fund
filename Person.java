package com.example.helloworld;

public class Person {
    String name;
    int age;
    String gender;
    double weight;

    Person(String name, int age, String gender, double weight){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
        int eyes = 2;
        int legs = 4;
        boolean speak = true;
        String feature = "hard worker";
        void born(){
            System.out.printf("%s started to live %n", this.name);
        }
        public String die(int a, int b){
            System.out.printf("%s died %n", this.name);
            return  "bb";
        }
        void features(){
            System.out.println(this.name + " is stupid piece of shit");
        }
    }
