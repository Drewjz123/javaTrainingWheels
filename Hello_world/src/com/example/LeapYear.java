package com.example;

public class LeapYear {

    public static void main(String[] args) {

        boolean result = isLeapyer(2000);
        System.out.println(result);
    }

    public static boolean isLeapyer(int year) {
        boolean flag = false;
        if (year >= 1 && year <= 9999) {
//


            if ((year % 4 == 0) && (year%100 == 0) && (year % 400 == 0)) {
                flag = true;
            } else if ((year % 4 == 0) && (year % 100 != 0)) {
                flag = true;
            } else if ((year % 4 == 0 )&& (year % 100 == 0) && (year % 400 != 0)) {
                flag = false;
            }




        }
        else{
            flag = false;
        }
        return flag;
    }

}


//            if((year%4 == 0)){
//                if(year%100== 0){
//                    if(year%400==0){
//                        flag = true;
//                    }
//                    else if(year%400 !=0){
//                        flag = false;
//                    }
//                }
//
//            } else{
//                flag = false;
//        }

//
//        }
//
//        else{
//            flag = false;
//        }

