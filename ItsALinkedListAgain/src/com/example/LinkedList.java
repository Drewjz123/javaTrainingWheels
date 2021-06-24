package com.example;


public class LinkedList{

    Node head;

    public void appendNode(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public String toString(){
        String result = "[";

        Node current = head;
        while(current!= null){
            result = result + current.data + "-->";
            current = current.next;

        }
        result = result + "]";

        return result;
    }

    public void prependNode(int data){

        Node newhead = new Node(data);

        newhead.next = head;
        head = newhead;

    }
    public void deleteNode(int data){
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next!= null){
            if(current.next.data == data){
                current.next = current.next.next;
            }
            current = current.next;
        }

    }
    public void appendAfterNode(int data, int new_data){
        Node current = head;
        Node newNode = new Node(new_data);
        while(current.next != null){
            if(current.next.data == data) {
                newNode.next = current.next.next;
                current.next.next = newNode;
                return;
            }
            current = current.next;
        }
    }

//    public void deleteAfterNode(int data){
//        Node current = head;
//        while(current.next != null){
//            if(current.next.data == data) {
//                current.next = current.next.next.next ;
//                return;
//            }
//            current = current.next;
//        }
 //   }

}