//import java.util.ArrayLis

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int count =0 ;
        int max_con =0;
        for(int i= 0; i<nums.length;i++){

            //System.out.println(nums[i]);
            if(nums[i]== 1){
                count++;
            }
            else if(nums[i]==0){

                if(count >=1){

                    max_con = count;
                    //System.out.println(max_con);
                }

                count = 0;
            }
        }
        int max_of_max = (count > max_con) ? count: max_con;

        return max_of_max;
    }
}




