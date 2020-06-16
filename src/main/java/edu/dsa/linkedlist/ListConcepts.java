package edu.dsa.linkedlist;

public class ListConcepts {

    Node head;

      class Node{
        int data;
        Node next;

        Node(int d){
             data =d;
            next =null;
        }
    }

    public void printList(){
        Node n = head;
        while (n != null){
            System.out.print(n.data +", ");
            n = n.next;
        }
    }

    public void insert(){
        ListConcepts lists = new ListConcepts();
        lists.head = new Node(10);
        lists.head.next = new Node(20);
        lists.head.next.next = new Node(30);
        lists.printList();
    }

    public static void main(String[] args) {

        ListConcepts lists = new ListConcepts();

        lists.insert();

    }

}
