package com.elif;

import com.elif.enumm.Days;

public class Main {
    public static void main(String[] args) {

        int number = 294;

       // Autoboxing : int -> Integer
       Integer wrapperNumber = number;
       // Unboxing : Integer -> int
       int unboxedNumber = wrapperNumber;

        System.out.println("int value: " + number);
        System.out.println("After autoboxing (Integer):  "+ wrapperNumber);
        System.out.println("After unboxing (int): " + unboxedNumber);
    }
}