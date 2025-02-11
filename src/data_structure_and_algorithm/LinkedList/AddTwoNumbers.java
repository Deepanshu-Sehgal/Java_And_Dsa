package data_structure_and_algorithm.LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {

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
            }
            if (r2 != null) {
                sum += r2.val;
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
