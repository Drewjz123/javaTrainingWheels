package com.example;

public class Main {

    public static void main(String[] args) {

        int[] boxes = new int[] {1,2,3,4,5};

        for(int i = 0; i<boxes.length;i++){
            for(int j = 0; j< boxes.length; j++ ){

                System.out.println("(" + boxes[i] + " "+ boxes[j] +")");
            }

        }
    }
}
