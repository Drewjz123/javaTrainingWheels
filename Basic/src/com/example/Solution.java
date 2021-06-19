import java.util.Scanner;

public class Solution {
    public static int front;
    public static int rear;
    static int[] a = new int[20];
    public static int n = a.length ;



    public static void main(String[] args) {

        front = rear = -1;



        // Write your code here.




        enqueue(20);
        enqueue(30);
        enqueue(25);
        display();
        dequeue();
        enqueue(30);
        display();


        //System.out.println(a[rear]);
        //System.out.println(a[front]);
    }

    public static void display(){

        for(int i= front;i <= rear; i++ ) System.out.println(a[i]);
    }
    public static boolean isEmpty(){
       int flag = 0;

        if (front == rear){

            flag = 1;
        }
        else{

            flag = 0;
        }

        return flag != 0;


    }

    /*public static boolean isFull(){

        boolean flag = false;

        if (rear == a.length - 1){

            flag = true;
        }


    return flag;
    }
*/
    public static void enqueue(int x){

        if(rear == a.length -1){

            System.out.println("The Array is Full");

        }

        else if(rear == -1 & front == -1){
            front++;
            rear ++;
            a[rear] = x;
        }

        else {
            rear ++;
            a[rear] = x;
        }

    }

    public static void dequeue(){

        if(front == -1 && rear == -1){

            System.out.println("The Array is empty Pop operation cannot be performed");
        }

        else{
            int g = a[front];
            front ++;
            System.out.println("Element Popped :" +g);
        }
    }


}


