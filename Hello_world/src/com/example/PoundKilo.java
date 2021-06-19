package com.example;

public class PoundKilo {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0040';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyRightChar = '\u00A9';

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyone = true;

        System.out.println(myCopyRightChar);

        String myString = "This is a string";
        System.out.println("MyString is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);


        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println("LastString is equal to:" + lastString);

        int topscore = 10;

        boolean ad = false;

        if (!ad) {

            System.out.println("true");
        }

    }


}
