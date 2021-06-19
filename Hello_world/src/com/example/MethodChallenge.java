package com.example;

public class MethodChallenge {
    public static void main(String[] args) {
        System.out.println("xx");



        int val1 = calculateHighScorePosition(1500);
        System.out.println(val1);
        int val2 = calculateHighScorePosition(900);
        System.out.println(val2);
        int val3 = calculateHighScorePosition(400);
        System.out.println(val3);
        int val4 = calculateHighScorePosition(50);
        System.out.println(val4);

        displayHighScorePosition("Dhruv", val1 );
        displayHighScorePosition("Dhruv", val2 );
        displayHighScorePosition("Dhruv", val3 );
        displayHighScorePosition("Dhruv", val4 );



    }

    public static void displayHighScorePosition(String pName, int pPosition){

        System.out.println("Name of the Player:" + pName + " Managed to get Postion:"
                + pPosition + " On the High score table");


    }

    public static int calculateHighScorePosition(int pScore){

//        if (pScore >= 1000){
//
//            return 1;
//        }
//        else if (pScore >= 500){
//            return 2;
//        }
//
//        else if (pScore >= 100){
//            return 3;
//
//        }
//        else{
//            return 4;
//        }

        int position =4 ;

        if(pScore >= 1000){
            position = 1;
        }else if(pScore >=500){
            position = 2;

        }else if(pScore >= 100){
            position = 3;
        }
       return position;
    }
}
