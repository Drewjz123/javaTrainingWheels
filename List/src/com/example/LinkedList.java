package com.example;

public class LinkedList {
    Node head;
    Node tail;
    public void addNode(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        tail = tail.next;
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = head;
        while(current.next != null) {
            result = result + current.data + "--->";
            current = current.next;
        }
        result = result + current.data +"]";

        return result;
    }
}
