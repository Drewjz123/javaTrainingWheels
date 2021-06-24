package com.example;

public class Node {
     Node next;
     int data;

    public Node(int data) {

        this.data = data;
    }

    public void setData(int data){

        this.data = data;
    }
    public Integer getData(){

        return this.data;
    }
}
