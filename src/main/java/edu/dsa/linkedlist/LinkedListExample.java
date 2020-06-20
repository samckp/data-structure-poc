package edu.dsa.linkedlist;

public class LinkedListExample {

        Node head;  // head of the list

        class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }

       // Inserts a new Node at front of the list.
        public void push(int data)
        {
            // 1 & 2: Allocate the Node & Put in the data
            Node new_node = new Node(data);

            // 3. Make next of new Node as head
            new_node.next = head;

            /* 4. Move the head to point to new Node */
            head = new_node;
        }

        /* Inserts a new node after the given prev_node. */
        public void insertAfter(Node prev_node, int new_data)
        {
            /* 1. Check if the given Node is null */
            if (prev_node == null)
            {
                System.out.println("Previous node can't be null");
                return;
            }

            Node new_node = new Node(new_data);
            new_node.next = prev_node.next;
            prev_node.next = new_node;
        }

        // Add a new node
        public void append(int new_data)
        {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
            Node new_node = new Node(new_data);

        /* 4. If the Linked List is empty, then make the
              new node as head */
            if (head == null)
            {
                head = new Node(new_data);
                return;
            }

        /* 4. This new node is going to be the last node, so
              make next of it as null */
            new_node.next = null;

            /* 5. Else traverse till the last node */
            Node last = head;
            while (last.next != null)
                last = last.next;

            /* 6. Change the next of last node */
            last.next = new_node;
            return;
        }

        public void printList()
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

            // Insert 5.
            // It becomes 5->Null list
            llist.append(5);

            // Insert 9 at the beginning.
            // 9->5->Null list
            llist.push(9);

            // Insert 2 at the beginning
            // 2->9->5->Null list
            llist.push(2);

            // Insert 4 at the end.
            // 2->9->5->4->Null list
            llist.append(4);

            // Insert 8, after 5.
            // 2->9->8->5->4->Null list
            llist.insertAfter(llist.head.next.next, 8);

            System.out.println("\nThe Linked list is :: ");
            llist.printList();
        }
    }
