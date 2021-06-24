package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList list = new LinkedList();
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        StackUsingLinkedList stack = new StackUsingLinkedList();
//        stack.push(10);
//        stack.push(10);
//        stack.push(10);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.appendNode(40);
        System.out.println(list);
        list.deleteNodeAnywhere(30);
        System.out.println(list);

    }
}
