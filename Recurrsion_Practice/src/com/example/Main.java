package com.example;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 111, 3, 121, 141};
        //System.out.println(array11(array1, 0));
        System.out.println(binarySearch(array1, 0, 4, 141));
    }

    public static int binarySearch(int[] nums, int left, int right, int number) {
        //int count = 0;

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (nums[mid] == number) {
            return mid;
        }

        if (nums[mid] < number) {
            binarySearch(nums, left, mid - 1, number);
        }

        return binarySearch(nums, mid + 1, right, number);
    }
}
