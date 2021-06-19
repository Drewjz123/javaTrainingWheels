package com.example;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim",500);
        int newScore_1 =  calculateScore(56);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player : " + playerName + " Has scored: " + score);
        return score * 1000;

    }

    public static int calculateScore(int score) {

        System.out.println("Player unnamade Has scored: " + score);
        return score * 1000;
    }
}
