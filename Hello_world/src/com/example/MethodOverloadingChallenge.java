package com.example;

public class MethodOverloadingChallenge {
    public static void main(String[] args) {

        double centimeter = calcFeetAndInchesToCentimeters(-10,1);
        System.out.println(centimeter);
        double centimeter_overloaded = calcFeetAndInchesToCentimeters(12);
        System.out.println(centimeter_overloaded);
    }

    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
        if(feet <0 || (inches <0 && inches > 12)){
            return -1;
        }
        else {
            return (((feet*12)*2.54 )+ (inches *2.54));
        }


    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches <=0){
            return -1;
        }
        else{

            return inches*2.54;

        }
    }
}
