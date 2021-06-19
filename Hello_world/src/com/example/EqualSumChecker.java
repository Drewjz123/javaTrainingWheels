package com.example;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean result = hasEqualSum(1,1,1);
        System.out.println(result);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        boolean flag = true;
        if(num1 + num2 == num3){
            flag = true;

        }
        else{
            flag = false;
        }
        return flag;
    }
}
