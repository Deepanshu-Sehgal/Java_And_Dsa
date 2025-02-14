package data_structure_and_algorithm.LinkedList;

public class ReverseKLL {
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
        Node<Integer> ans = reverseKGroups(head,4);
        LearnLLAnuj.printLL(ans);
    }

    static Node<Integer> reverseKGroups(Node<Integer> head, int k) {
        Node<Integer> dummy = new Node<>(-1);
        dummy.next = head;

        Node<Integer> prevTail = dummy;
        Node<Integer> curHead = head;
        while (curHead != null) {
            Node<Integer> currTail = findTailAfterK(curHead, k);
            if (currTail == null) break;
            Node<Integer> nextHead = currTail.next;
            reverseKTimes(curHead, k);
            prevTail.next = currTail;
            prevTail = curHead;
            curHead = nextHead;

        }
        prevTail.next = curHead;
        return dummy.next;
    }

    static Node<Integer> findTailAfterK(Node<Integer> head, int k) {
        for (int i = 0; i < k - 1; i++) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        return head;
    }

    static Node<Integer> reverseKTimes(Node<Integer> head, int k) {
        if (head == null || head.next == null) return head;
        Node<Integer> curr = head;
        Node<Integer> prev = null;

        int count = 0;
        while (count < k && curr != null) {
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        return prev;
    }
}
