package com.elif;

import com.elif.enumm.Days;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*
        Days today = Days.WEDNESDAY;
        System.out.println("Today is: " + today);
    */
    /*
        ArrayList<String> cities = new ArrayList<>();
        cities.add("İzmir");
        cities.add("Ankara");
        cities.add("İstanbul");

        for (String city: cities){
            System.out.println(city);
       }
    */
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