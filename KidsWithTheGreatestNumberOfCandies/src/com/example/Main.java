package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] candies = new int[]{4,2,1,1,2};
        int extraCandies = 1;

        List<Boolean> booleanArray = new ArrayList<Boolean>();
        booleanArray = kidsWithCandies(candies,extraCandies);
        System.out.println(booleanArray);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanArray = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for(int i=0; i< candies.length;i++){
          max = candies[i]>=max ?candies[i]:max;
        }
        System.out.println(max);

        for(int i= 0; i< candies.length; i++){
            Boolean var = extraCandies + candies[i]>= max? true: false;
            booleanArray.add(var);

        }

        return  booleanArray;

    }
}
