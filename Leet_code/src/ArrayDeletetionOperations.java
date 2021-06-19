import java.util.HashSet;

public class ArrayDeletetionOperations {
    static int length =0;
    static int count = 0;
    static HashSet<Integer> index = new HashSet<Integer>();
    public static void main(String[] args) {

        int [] array = new int[]{3,2,2,3};
//        calculateLength(array);
//        System.out.println();
//        printArray(array);
//        deleteFromPos(array,3);
//        System.out.println();
//        printArray(array);
    }

    public static void calculateLength(int [] array){

        for(int i = 0; i < array.length; i ++) {
            length++;
        }
        System.out.print("The total elements in the array are:" + length);


    }

    public static void deleteFromBeginning(int [] array){
        for(int i = 1; i < length; i++){
            array[i-1]= array[i];

        }
        length--;
    }

    public static void deleteFromEnd(int [] array){
        length--;
    }

    public static void deleteFromPos(int [] array, int pos) {
        for(int i =pos+1; i < length ; i++){
            array[i-1] = array[i];
        }
        length --;

    }

    public static void printArray(int [] array){
        for(int i = 0 ; i < length; i++){
            System.out.print(" "+ array[i]);


        }
    }

    public static void deleteValue(int[] array, int value){
        int flag = 0;
       // while(flag < count){
            //deleteFromPos(array[]);
       // }

    }
    public static void findIndexOfValue(int array[], int value){


        for(int i = 0 ; i< length; i++){
            if(array[i]==value){
                index.add(i);
                count ++;
            }
        }

    }

}
