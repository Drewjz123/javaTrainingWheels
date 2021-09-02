package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "Hi My name is Andrei";
         String st = reverseString(str);
        System.out.println(st);
        //System.out.println(sa);
//        for(int i = 0; i< a.length; i ++){
//            System.out.println(a[i]);
//        }

    }
    public static String reverseString(String str){
        int totalitems = str.length()-1;
        StringBuilder a = new StringBuilder(str.length());
        String[] arrOfStr = str.split("",0);
        String[] duplicate = new String[arrOfStr.length];
        for(int i = totalitems; i>=0; i--){
           duplicate[totalitems-i] = arrOfStr[i];

        }
        for(String i : duplicate){
            a.append(i);
            a.insert()
        }
        return a.toString();
    }
}
