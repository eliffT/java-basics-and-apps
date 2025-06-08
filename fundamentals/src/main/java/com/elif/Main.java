package com.elif;

import com.elif.enumm.Days;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.forEach (System.out::println);


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
    /*
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit: fruits){
            System.out.println(fruit);
        }
*/
        /*
        Map<String, Integer> students = new HashMap<>();
        students.put("Ahmet", 90);
        students.put("Ayşe", 85);
        students.put("Mehmet", 75);

        for (Map.Entry<String, Integer> entry: students.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


         */

      /*  Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter a second number: ");
            int number2 = scanner.nextInt();

            int result = number1 / number2;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        */

    }
}