package com.marlan;

import java.util.Random;

public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        int sizeOfTree = 10;
        Random random = new Random();

        Node root = new Node(5);

        for (int i = 0; i < sizeOfTree; i++) {
            // root.insert(random.nextInt(0,100));
            root.insert(i);
        }

        System.out.println("In Order:"); // LEFT ROOT RIGHT | 0 1 2 3 4 5 6 7 8 9
        root.printInOrder();
        System.out.println("-----------------");

        System.out.println("Post Order:"); // LEFT RIGHT ROOT | 0 1 2 3 4 6 7 8 9 5
        root.printPostOrder();
        System.out.println("-----------------");

        System.out.println("Pre Order:"); // ROOT LEFT RIGHT | 5 0 1 2 3 4 6 7 8 9
        root.printPreOrder();
        System.out.println("-----------------");
    }
}