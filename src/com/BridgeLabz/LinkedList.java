package com.BridgeLabz;

public class LinkedList {
    //addNode Method is created to add data into LinkedList
    public Node addNode(Node head, int data){
        Node newNode = new Node(data);

        if(head == null)
            head = newNode;
        else {
            Node temp = head; //head = 100, temp = 100
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    public Node InsertNode(Node head, int data, int insert) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            int position = 0;
            while (temp.next != null && position != insert - 2) {
                temp = temp.next;
                position++;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
        return head;
    }

        //Display Method is used to Display LinkedList
    public void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
    }
}
