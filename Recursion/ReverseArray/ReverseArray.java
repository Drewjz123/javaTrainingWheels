package ReverseArray;

public class ReverseArray {

 public static void main(String [] args){
  int [] arr = new int []{1,2,3,1,1,3};
  // int [] abc = reverseArray(arr);
  // for(int a : abc){
  //  System.out.print(a);
  // }
  int answer = goodPairs(arr);
  System.out.print(answer);
 }

 public static int[] reverseArray(int [] arr){
  int start = 0;
  int end = arr.length -1;

  while(start < end){
   int temp = arr[start]; 
   arr[start] = arr[end]; 
   arr[end] = temp; 
   start++;
   end--;
  }

  return arr; 
 }

 public static int secondLargestInt(int [] arr){
  int largestNumber = 0;
  int secondLargestNumber = 0;

  for(int i = 0; i < arr.length ; i ++){
   if(arr[i] > secondLargestNumber){
    largestNumber = arr[i];
   }
   // if(arr[i] > )
  }


  return secondLargestNumber;
 }

 public static int goodPairs(int [] arr){
  int count = 0; 
  int start = 0;
  int end = arr.length -1;
  while(start< end){
   if(arr[start] == arr[end]){
    count ++;
    start++;
    end--;
   }
   start++;
   end--;
  }
  return count; 
 }
 
}
