package data_structure_and_algorithm.LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Meathods
    public void addFirst(int data) {
        //step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        //step 2- newNode next = head
        newNode.next = head; // link

        //step 3 - head = newNode
        head = newNode;

    }

    public void addLast(int data) {
        //step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step 2 - tail.next = newNode
        tail.next = newNode;

        //step 3 - newNode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1;temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.head = new Node(1);
//        ll.head.next = new Node(2);
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
//        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
    }
}
