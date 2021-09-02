package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        print(9);
    }

    public static void print(int n){
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.print(n+"");
    }
}