package com.example;

public class LinkedList {
    Node head;
    Node tail;
    public void appendNode(int data){
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
        //Node current = head;
        //while(current.next != null){
            //current = current.next;
        //}
        //current.next = newNode;
    }

    public void deleteNodeAnywhere(int data){
        Node current = head;
        if(head == null){
            System.out.println("This list is empty");
        }
        while(current.next !=null){
            if(current.data == data) {
                current.next.next = current.next;
                return;
            }
            current = current.next;
        }


    }

    public String toString(){
        Node current = head;
        String result = "[";
        while(current.next != null){
            result = result + current.data + "--->";
            current = current.next;
        }
        result = result + current.data + "]";
        return result;
    }
}