package com.napier.sem;

public class App2 {

    public static void main(String[] args) {

        String name = "Cherry";
        int age = 20;

        System.out.println("Hello, " + name + "!");
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
    }
}

