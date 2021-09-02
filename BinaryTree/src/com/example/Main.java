package com.example;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addTreeNode(10);
        tree.addTreeNode(20);
        System.out.println(tree.root.data);
       tree.addTreeNode(30);
        tree.addTreeNode(40);
        tree.displayTree();
    }
}
