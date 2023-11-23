package Amity_DSA.linked_list;

class Node {
    int data;
    NodeInetr next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    AllNode head;

    LinkedList() {
        head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void append(int data) {
        AllNode newAllNode = new AllNode(data);
        if (head == null) {
            head = newAllNode;
        } else {
            AllNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newAllNode;
        }
    }

    // Method to traverse and print the linked list
    public void traverse() {
        AllNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Traversing {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Appending elements to the linked list
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(10);
        linkedList.append(15);

        // Traversing and printing the linked list
        System.out.println("Linked List Elements:");
        linkedList.traverse();
    }
}

