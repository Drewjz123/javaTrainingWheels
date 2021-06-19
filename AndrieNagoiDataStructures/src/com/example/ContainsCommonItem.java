/*
Given 2 arrays, create a function that let's a user know (true/false) whether
these two arrays contain any common items

For Example:
const array1 = ['a','b','c','x']
const array2 = ['z','y','i']
//should return false.

---------
const array1 = ['a','b','c','x']
const array2 = ['z','y','x']
should return true
*/
package com.example;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsCommonItem {
    public static void main(String[] args) {

        char [] array1 = new char [] {'a','b','c','x'};
        char [] array2 = new char [] {'z','y','d'};

       boolean result = hasCommon(array1,array2);
        System.out.print(result);
    }

    public static boolean hasCommon(char []array1, char [] array2){
//        boolean result = true;
//        HashMap<Character,Boolean> array1List = new HashMap<Character,Boolean>();
//        for(int i = 0; i < array1.length ; i ++){
//            array1List.put(array1[i],true);
//        }
//        for(int j = 0; j < array2.length; j ++)
//
//           result =  array1List.containsKey(array2[j]);
//        return result;
//        }
//
            HashSet<Character> itemsFromarray = new HashSet<Character>();
            boolean result = true;
            for(int i = 0; i < array1.length ; i ++){
                if(!itemsFromarray.contains(array1[i])){
                    itemsFromarray.add(array1[i]);
                }
            }

            for (int j = 0; j < array2.length ; j ++) {

               result = itemsFromarray.contains(array2[j]);

            }

            return result;
    }

    }

