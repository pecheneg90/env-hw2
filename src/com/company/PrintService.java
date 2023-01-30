package com.company;

public class PrintService {
    public static void print(Hogwarts[] persons) {
        for (Hogwarts person : persons) {
            System.out.println(person);
        }
        System.out.println();
    }
}