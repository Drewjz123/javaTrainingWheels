import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        int [][] account = new int[][]{{2,8,7},{7,1,3},{1,9,5}};

        int a  = maximumWealth(account);
        System.out.println(a);

    }

    public static int maximumWealth(int [][] accounts){
        int result = 0;
        int decider = 0;
        int temp = 0;
        int index = 0;
        //Set<Integer> rich = new HashSet<Integer> ();

        /*
        1. We traverse through the 2d array and built up the result;
        2. We use a second variable to compare the result and return the max number;

         */
        for(int outer = 0; outer< accounts.length; outer++){
            for(int inner = 0; inner<accounts[outer].length;inner++){
                result = result+ accounts[outer][inner];
            }x
            temp = (temp>=result)? temp:result;
            //decider = (temp>=result)? temp:result;
            System.out.println(temp);
            //rich.add(result);

            //System.out.println(result);
            result = 0;

        }
        //System.out.print(rich.size());
        return temp;
    }
}
