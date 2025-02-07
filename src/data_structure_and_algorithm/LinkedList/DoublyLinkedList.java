package data_structure_and_algorithm.LinkedList;

public class DoublyLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> v1 = new Node<>(2);
        Node<Integer> v2 = new Node<>(3);
        Node<Integer> v3 = new Node<>(14);
        Node<Integer> v4 = new Node<>(15);

        head.next = v1;
        v1.prev = head;

        v1.next = v2;
        v2.prev = v1;

        v2.next = v3;
        v3.prev = v2;

        v3.next = v4;
        v4.prev = v3;

        LearnLLAnuj.printLL(head);
        LearnLLAnuj.printLL(insertInLL(2,32,head));
        LearnLLAnuj.printLL(deleteFromLL(2,head));



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
        temp.next.next.prev = temp;
        return head;
    }

    static Node<Integer> insertInLL(int pos, int data, Node<Integer> head) {
        Node<Integer> newNode = new Node<>(data);

        if (pos == 0) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        Node<Integer> temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next.prev = newNode;

        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
}
