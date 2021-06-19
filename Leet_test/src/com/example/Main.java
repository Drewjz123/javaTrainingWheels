package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] nums = new int[] {1,2,3,4};

        int max = -1;
        int twice_num = -1;
        int index = -1;



        for(int i = 0; i< nums.length; i++){

            if(nums[i]>=max){
                max = nums[i];
                index = i;
            }



            if((nums[i]*2 >= twice_num )&& (nums[i] !=max) && (i != index )){

                twice_num = nums[i]*2;
                System.out.println("This is the twice nums:"+twice_num);

            }

        }

        System.out.println(max);
        System.out.println(twice_num);

        if(nums.length == 1){
            System.out.println(0);
        }

        if(max > twice_num){
            System.out.println(index);

        }

        else{
            System.out.println(-1);
        }
    }


}

