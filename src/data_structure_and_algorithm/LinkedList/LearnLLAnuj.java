package data_structure_and_algorithm.LinkedList;

public class LearnLLAnuj {

    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> v1 = new Node<>(2);
        Node<Integer> v2 = new Node<>(3);
        Node<Integer> v3 = new Node<>(14);
        Node<Integer> v4 = new Node<>(15);
        head.next = v1;
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;

        printLL(head);
//        Node<Integer> newList = insertInLL(2, 34, head);
        Node<Integer> newList = deleteFromLL(2, head);
        printLL(newList);


    }

    static Node<Integer> deleteFromLL(int pos, Node<Integer> head){
        Node<Integer> temp  = head;
        if (pos == 0){
            head = head.next;
            return head;
        }
        for (int i = 0; i < pos - 1; i++) {
           temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static void printLL(Node<Integer> head) {
        Node<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }

    static Node<Integer> insertInLL(int pos, int data, Node<Integer> head) {
        Node<Integer> newNode = new Node<>(data);

        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        Node<Integer> temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

}

class Node<E> {
    E val;
    Node<E> next;
    Node<E> prev;

    public Node(E val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
