package data_structure_and_algorithm.LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Node<Integer> l1 = new Node<>(1);
        Node<Integer> v1 = new Node<>(2);
        Node<Integer> v2 = new Node<>(3);
        l1.next = v1;
        v1.next = v2;

        Node<Integer> l2 = new Node<>(9);
        Node<Integer> v6 = new Node<>(4);
//        Node<Integer> v7 = new Node<>(2);

        l2.next = v6;

        LearnLLAnuj.printLL(l1);
        LearnLLAnuj.printLL(l2);
        Node<Integer> addition = addTwoNumbers(l1,l2);
        LearnLLAnuj.printLL(addition);


    }

    static Node<Integer> addTwoNumbers(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> r1 = reverseLinkedList(l1);
        Node<Integer> r2 = reverseLinkedList(l2);
        int carry = 0;
        Node<Integer> ans = null;
        Node<Integer> temp = null;


        while (r1 != null || r2 != null || carry != 0) {
            int sum = carry;
            if (r1 != null) {
                sum += r1.val;
                r1 = r1.next;
            }
            if (r2 != null) {
                sum += r2.val;
                r2 = r2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;
            Node<Integer> newNode = new Node<>(digit);
            if (ans == null) {
                ans = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

        }
        return reverseLinkedList(ans);
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
