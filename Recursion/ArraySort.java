import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArraySort {
 public static void main(String [] args){
  //Integer [] array = new Integer [] {2,3,1,0,8,6,5};

//  List<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(array));
//  //System.out.println(arraylist);
//  //int temp = arraylist.remove(array.length -1);
//  //System.out.println(temp);
//  System.out.println(arraylist);
//  sortArray(arraylist);
//  System.out.println(arraylist);
ArrayList<Integer> arraylist = new ArrayList<Integer>(Arrays.asList(2,3,1,0,8,6,5));
sortArray(arraylist);
System.out.println(arraylist);

}

public static void sortArray(ArrayList<Integer> arraylist){
     if(arraylist.size() == 1 ){
      return;
     }
     int temp = arraylist.get(arraylist.size()-1);
      arraylist.remove(arraylist.size()-1);
       sortArray(arraylist);
      insert(arraylist, temp);  
}

public static void insert(ArrayList<Integer>  arraylist, int temp){
 if(arraylist.size() == 0 || arraylist.get(arraylist.size()-1) <= temp){
  arraylist.add(temp);
  return;
 }
 else{
  int val = arraylist.get(arraylist.size()-1);
  arraylist.remove(arraylist.size()-1);
  insert(arraylist, temp);
  arraylist.add(val);
  return;
 }

}
 
}



