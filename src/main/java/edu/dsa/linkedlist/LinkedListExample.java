package edu.dsa.linkedlist;

public class LinkedListExample {

        Node head;  // head of the list

        class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }

        public void push(int data)
        {
            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;
        }

        public void insertAfter(Node prev_node, int new_data)
        {
            if (prev_node == null)
            {
                System.out.println("Previous node can't be null");
                return;
            }
            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }

        public void append(int new_data)
        {
            Node new_node = new Node(new_data);
            if (head == null)
            {
                head = new Node(new_data);
                return;
            }
            new_node.next = null;
            Node last = head;
            while (last.next != null)   // traverse till last node
                last = last.next;

            last.next = new_node;
            return;
        }

        public void printList()     //Print linkedList
        {
            Node res_node = head;
            while (res_node != null)
            {
                System.out.print(res_node.data+" ");
                res_node = res_node.next;
            }
        }

        public static void main(String[] args)
        {
            LinkedListExample llist = new LinkedListExample();

            llist.append(5);        // insert at end
            llist.push(9);      // insert from beginning
            llist.push(2);
            llist.append(4);

            llist.insertAfter(llist.head.next.next, 8);

            System.out.println("\n The Linked list is :: ");
            llist.printList();
        }
    }
