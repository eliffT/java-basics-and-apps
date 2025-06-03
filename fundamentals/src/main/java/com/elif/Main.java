package com.elif;

import com.elif.enumm.Days;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}