package data_structure_and_algorithm.LinkedList;

public class FindMiddleNode {
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

        Node<Integer> middle = findMiddle(head);
        System.out.println(middle.val);
    }

    static Node<Integer> findMiddle(Node head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
