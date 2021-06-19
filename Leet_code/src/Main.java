public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[6];
        int length = 0;
        int current_element = 0;
        for (int i = 0; i < 3; i++) {

            intArray[length] = i;
            length++;
            current_element++;

        }
        intArray[length] = 10;
        intArray[intArray.length-1]=5;
        length++;
        current_element++;
        System.out.println(length
        );
        //display_array(intArray);
        //insert_at_start(5, intArray, current_element);
        //insert_at_any_position(25,intArray,5);
        ////insert_at_end(25,intArray);
        //System.out.println(intArray.length);
    }

    public static void display_array(int[] intArray){

            for(int i = 0; i< intArray.length; i++){

                System.out.println("Index " + i +" Contains " + intArray[i]);
            }


        }
    public static void insert_at_start(int element, int[] intArray, int current){

        for(int i =current; i>=0; i--){

            intArray[i+1] = intArray[i];




        }

        intArray[0] = element;
        display_array(intArray);

    }
    public static void insert_at_end(int element, int[] intArray){

        if(intArray[intArray.length-1 ]!= 0){
            System.out.println("Array is Full");
        }
        else if(intArray[intArray.length-1 ]== 0)
            intArray[intArray.length - 1] = element;

            display_array(intArray);

    }

    public static void insert_at_any_position(int element, int[] intArray, int position){

        if(position == intArray.length && intArray[position] !=0){
            System.out.println("Array is Full");
        }
        else if(position == intArray.length && intArray[position] == 0){

            intArray[position] = element;
        }
        else {
            for (int i = position; i >= 0; i--) {

                intArray[i + 1] = intArray[i];
                System.out.println(i);
            }

//        for(int i = 0; i<intArray.length; i++){
//
//            System.out.println(i);
//        }
            intArray[position] = element;
        }
        display_array(intArray);

    }


    }

