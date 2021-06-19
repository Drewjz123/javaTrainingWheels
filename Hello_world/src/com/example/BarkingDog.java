package com.example;

public class BarkingDog {

    public static void main(String[] args) {
       boolean result = shouldWakeUp(true, -1);
        System.out.println(result);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean flag  = false;
        if(hourOfDay <0 || hourOfDay > 23){
            flag = false;
        }
        else if (((hourOfDay < 8) || (hourOfDay > 22 )) && barking !=false){
            flag = true;
        }
        else if(barking == false){
            flag = false;
        }
        return flag;
    }
}
