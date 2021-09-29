package com.BridgeLabz;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        System.out.println("Enter The Number Of Codes");
        int nodes = Sc.nextInt();
        Node head = null;
        for (int i = 0; i < nodes; i++) {
            System.out.println("Enter number " + (i + 1));
            int data = Sc.nextInt();
            head = linkedList.addNode(head, data);
        }
        linkedList.display(head);
    }
}