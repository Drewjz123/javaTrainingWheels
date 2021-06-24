package com.example;

public class MyLinkedList {
    Node head;
    Node tail;

    public MyLinkedList(){
        head = null;
    }

    private Node getNode(int index){
        Node current = head;
        for(int i =0 ; i < index && current!= null; ++i){
            current = current.next;
        }
        return current;
    }

    private Node getTail(){
        Node current = head;
        while(current != null){
            current = current.next;
        }
        return current;
    }

    public int get(int index){
        Node current = getNode(index);

        return current == null ? -1 : current.val;
    }

    public void addAtHead(int val){
        Node current = new Node(val);
        current.next = head;
        head = current;
        return;
    }

    public void addAtTail(int val){
       Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }
}
