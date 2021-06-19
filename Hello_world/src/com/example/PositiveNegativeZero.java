package com.example;

public class PositiveNegativeZero {
    public static void main(String[] args) {
     checkNumber(-1);
     checkNumber(10);
    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("Postive");
        }
        if(number <0){
            System.out.println("Negative");
        }
        if(number == 0 ){
            System.out.println("Zero");
        }

    }
}
