package data_structure_and_algorithm.LinkedList;

public class reverseLL {
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
//        Node<Integer> newNode = reverseLinkedList(head);
        Node<Integer> newNode2 = reverseLLRecursively(head);
//        LearnLLAnuj.printLL(newNode);
        LearnLLAnuj.printLL(newNode2);

    }

    static Node<Integer> reverseLLRecursively(Node<Integer> head) {
        if (head == null || head.next == null) return head;

        Node<Integer> headOfSubProblem = reverseLLRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return headOfSubProblem;
    }

    static Node<Integer> reverseLinkedList(Node<Integer> head) {
        if (head == null || head.next == null) return head;
        Node<Integer> prev = head;
        Node<Integer> curr = head.next;
        head.next = null;
        while (curr != null) {
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
