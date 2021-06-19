package com.example;

public class OperatorChallenge {
    public static void main(String[] args) {

        double op = 20.00d;

        double op1 = 80.00d;

        double operation = (op + op1) * 100.00;
        System.out.println(operation);
        double reamainder = operation % 40.00d;

        System.out.println(reamainder);

        boolean remainder_bool = true;

        remainder_bool = reamainder == 0 ? true : false;

        System.out.println(remainder_bool);

        if (!remainder_bool) {

            System.out.println("Got some remainder");
        }
    }
}
