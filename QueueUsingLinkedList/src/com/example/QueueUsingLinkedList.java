package com.example;

public class QueueUsingLinkedList {
    LinkedList list = new LinkedList();
    public void enqueue(int data){
        list.appendNode(data);
    }

    public void dequeue() {
        if (list.head == null) {
            System.out.println("This queue is empty");
        } else {
            list.head = list.head.next;
        }
    }

    public void top() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("" + list.head.data);
        }
    }

    public boolean isEmpty(){
        if(list.head == null){
            return true;
        }
        return false;
    }

    public String toString(){
        Node current = list.head;
        String result = "[";
        while(current.next != null){
            result = result + current.data + "--->";
            current = current.next;
        }
        result = result + current.data + "]";
        return result;
    }


}

