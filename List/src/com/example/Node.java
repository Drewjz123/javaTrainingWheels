package com.example;

public class Node {
    Node next;
    int data;

    public Node(int data){
        this.data = data;
    }

    public int setData(int data){

        this.data = data;
        return  data;
    }

    public int getData() {
        return data;
    }

}
