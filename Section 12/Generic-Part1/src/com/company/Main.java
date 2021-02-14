package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // <Integer> is the generic class
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        printArrayList(items);
    }

    private static void printArrayList(ArrayList<Integer> items){
        for(Integer i : items){
            System.out.println(i);
        }
    }
}
