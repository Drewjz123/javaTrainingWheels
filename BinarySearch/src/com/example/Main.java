package com.example;

public class Main {
    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int [] array = new int[]{1,2,3,4,5,6};
        int result = search.binarySearch(array, 5);
        System.out.println(result);
    }
}
