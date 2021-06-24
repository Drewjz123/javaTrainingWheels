package com.example;

public class StackUsingLinkedList extends LinkedList {
    Node tail;
    LinkedList list = new LinkedList();
    public void Top(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("" + list.head.data);
        }
    }
    public void push(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node Current = head;
        while(Current.next != null){
            Current = Current.next;

        }
        Current.next = newNode;
    }
    public void pop(){
        Node Current = head;
        while(Current.next != null){
            Current = Current.next;

        }
        Current.next = Current;
    }

    public boolean isEmpty(){
        if(list.head == null){
            return true;
        }
        return false;
    }


}
