package com.example;
import jdk.jshell.Snippet;

import java.lang.Math;

public class SpeedConverter {

    public static void main(String[] args) {

       long miles = toMilesPerHour(10.34);
       printConversion(25.34);
        System.out.println(miles);

    }

    public static long toMilesPerHour(double KilometersPerHour){
            long miles = 0;
            if(KilometersPerHour <0){
                miles = -1;
            }else if(KilometersPerHour > 0){
                miles =  Math.round(0.621371*KilometersPerHour);

            }
       return miles;
    }

    public static void printConversion(double kilometersPerHour){

          long miles = 0;

          if(kilometersPerHour < 0){
              miles = -1;
              System.out.println("Invalid Value");
          }
          if (kilometersPerHour >0){
              miles =  Math.round(0.621371*kilometersPerHour);
              System.out.println(kilometersPerHour +" km/h = " + miles +" mi/h");
          }

    }
}
