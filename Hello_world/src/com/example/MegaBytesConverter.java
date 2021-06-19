package com.example;
import java.lang.Math;
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else if(kiloBytes>=0) {

            int megaBytes = Math.round(kiloBytes / 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytes % 1024 + " KB");
        }

    }
}
