package data_structure_and_algorithm.LinkedList;

public class ReorderLL {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> v1 = new Node<>(2);
        Node<Integer> v2 = new Node<>(3);
        Node<Integer> v3 = new Node<>(4);
        Node<Integer> v4 = new Node<>(5);
//        Node<Integer> v5 = new Node<>(6);
        head.next = v1;
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
//        v4.next = v5;

        LearnLLAnuj.printLL(head);
        Node<Integer> ans = reorder(head);
        LearnLLAnuj.printLL(ans);
    }

    static Node<Integer> reorder(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node<Integer> l2 = reverseLinkedList(slow);
        Node<Integer> l1 = head;

        while (true) {
            if (l1 == l2) {
                l1.next = null;
                break;
            }

            Node<Integer> l1Next = l1.next;
            Node<Integer> l2Next = l2.next;
            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }
        return head;
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
