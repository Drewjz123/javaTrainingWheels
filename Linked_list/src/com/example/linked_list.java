package com.example;

public class linked_list {

    Node head;

    public linked_list(){

        head = null;

    }

    public boolean isEmpty(){

        return head == null;
    }

    public void insertAtBeginnign(int new_data){


        Node new_node = new Node(new_data);

        new_node.next = head;
        head = new_node;
    }


    public void insertAtEnd(int new_data){

        //Create a new node
        Node new_node = new Node(new_data);

        /* Base Condition
        The linked List is empty

         */
        if(head == null){

            head.next = new_node;
            return;

        }


        new_node.next = null;

        Node last = head;

        while(last != null)
            last = last.next;

        last.next = new_node;

        new_node.next = null;
        return;


    }

    public void insertionAfterGivenNode(Node prev_node , int new_data){

        if(prev_node == null){
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;

    }
    // Deletion

    public void delete(int position){

        


    }










}
