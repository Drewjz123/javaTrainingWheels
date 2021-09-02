package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String >();

        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add(0,"x");
        System.out.println(strings);

    }
}
