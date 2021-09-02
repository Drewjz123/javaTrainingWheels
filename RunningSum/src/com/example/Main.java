package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{3,1,2,10,1};
       int[] numsresult =  runningSum(nums);
       printArray(numsresult);

    }

    public static int [] runningSum(int [] nums){
        int index = 0;
        int result = 0;
        while(index <= nums.length-1){
            result = result + nums[index];
            nums[index]= result;
            System.out.println(result);
            index++;
        }
        return nums;
    }

    public static void printArray(int[] nums){
        for(int a: nums){
            System.out.print(" "+ a);
        }
    }
}
