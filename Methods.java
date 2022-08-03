package com.example.helloworld;

import java.util.Scanner;

public class Methods {
    public static void main() {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("name first" + name);
        String name = "narmin";
        callName(name);

    }
    public static void callName(String name) {
        System.out.println("Your name is " + name);

    }
}
