package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;


    public void addTreeNode(int data){
        Queue<Node> traversalQueue = new LinkedList<>();
        Node current;
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            //current = root;
            System.out.println("This is the root"+ root.data);
            return;
        }
        traversalQueue.add(root);
        int a = 0;
        while(!traversalQueue.isEmpty()){

            current = traversalQueue.poll();
           // System.out.println("This is the root" +current.data);
            //For figuring out if there is a empty spot

            if(current.left == null){

                current.left = newNode;
                return;
            }else{

                traversalQueue.add(current.left);
            }

            if(current.right == null){
                current.right = newNode;
                a++;
                return;
            }
            else{
                traversalQueue.add(current.right);
            }

        }
    }

    public void displayTree(){
        Queue<Node> traversalQueue = new LinkedList<>();
        Node current;
        //Node newNode = new Node(data);
        if(root == null){
            return;
        }
        traversalQueue.add(root);
        //int a = 0;
        while(!traversalQueue.isEmpty()){

            current = traversalQueue.poll();
            System.out.println("This is the node " +current.data);
            //For figuring out if there is a empty spot

            if(current.left == null){
                //current.left = newNode;
                continue;
            }else{
                traversalQueue.add(current.left);
            }

            if(current.right == null){
                continue;
            }
            else{
                traversalQueue.add(current.right);
            }

        }


    }

}
