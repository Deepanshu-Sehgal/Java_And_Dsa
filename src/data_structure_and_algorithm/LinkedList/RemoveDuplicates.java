package data_structure_and_algorithm.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> v1 = new Node<>(1);
        Node<Integer> v2 = new Node<>(2);
        Node<Integer> v3 = new Node<>(2);
        Node<Integer> v4 = new Node<>(15);
        Node<Integer> v5 = new Node<>(15);
        head.next = v1;
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
        v4.next = v5;



        LearnLLAnuj.printLL(head);
        Node<Integer> newHead  = removeDuplicateElements(head);
        LearnLLAnuj.printLL(newHead);

    }

    static Node<Integer> removeDuplicateElements(Node<Integer> head) {
        Node<Integer> original = head;
        Node<Integer> newHead = null;
        Node<Integer> temp = head;

        while (original != null) {
            while (original.next != null && original.val == original.next.val) {
                original = original.next;
            }
            if (newHead == null) {
                newHead = temp = original;
            } else {
                temp.next = original;
                temp = original;
            }
            original = original.next;
        }
        return newHead;
    }
}
