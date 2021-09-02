import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortYoutube{

    public static void main(String[] args) {


          ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,2,7,4,6,4));
          sorting(arr);
          System.out.println(arr);
          
    }    


public static void sorting(ArrayList<Integer> arr){
        
       if(arr.size() == 1){      // Base Condition
           return;
       }
       
       int temp = arr.get(arr.size() - 1);
       arr.remove(arr.size() - 1);
       sorting(arr);  // Hypothesis(Making Input Smaller)
       
       
       insert(arr, temp);  //Induction(Main logic to work our Hypothesis comes here)
       
    }
    
    public static void insert(ArrayList<Integer> arr, int temp){  
        
        if(arr.size() == 0 || arr.get(arr.size() - 1) <= temp){    // Base Condition
            arr.add(temp);
            return;
        }
        
        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        

        insert(arr, temp); // Hypothesis(Making Input Smaller)
        
        arr.add(val); // Induction
    }
   }