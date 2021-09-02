package com.example;

public class BinarySearch {
    int low;
    int high;
    int mid;

    public int binarySearch(int[] array, int itemToSearch){
        low = 0;
        high = array.length-1;


        while(low<= high){
            mid = (low + high)/2;
            int guess = array[mid];

            if(guess == itemToSearch){
                return mid;
            }
            else if(guess < itemToSearch){
                low = mid +1;
            }
            else if( guess > itemToSearch){
                high = mid+1;
            }

        }
        return -1;
    }
}
