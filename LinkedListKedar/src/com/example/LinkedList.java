package com.example;

public class LinkedList {

    Node head;

    public LinkedList(){
        head=null;
    }

    public boolean isEmpty(){

        return head == null;
    }

    public void insertAtBeginning(int new_data){

        Node new_node = new Node(new_data);

        new_node.next = head;
        head = new_node;
    }

    public void insertAtEnd(int new_data){

        Node new_node = new Node(new_data);

        if(head == null){
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;

        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public void insertAfterGivenNode(int new_data, Node prev_node) {



        if(prev_node == null){
            System.out.println("Node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }



}
