package com.example;
import java.lang.Math;
public class DecimalComparartor {
    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(4.0,5.0);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        boolean flag = false;
        System.out.println(num1+ " " + num2);
        num1 = (int)(num1*1000);
        num2 = (int)(num2*1000);
        System.out.println(num1+ " " + num2);
        if(num1==num2){
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }
}
