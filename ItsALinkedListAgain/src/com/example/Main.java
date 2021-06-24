package com.example;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.appendNode(10);
        list.appendNode(20);
        list.appendNode(30);
        list.prependNode(5);
        list.appendAfterNode(20,18);
        list.deleteNode(10);

        System.out.println(list);
    }
}

