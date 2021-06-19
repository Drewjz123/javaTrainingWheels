package com.example;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        User user = new User(25,"Bob");

        System.out.println(user);
        user.incrementAge(10);
        System.out.println(user);
    }
}
