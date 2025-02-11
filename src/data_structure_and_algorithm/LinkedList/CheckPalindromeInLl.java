package data_structure_and_algorithm.LinkedList;

public class CheckPalindromeInLl {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> v1 = new Node<>(1);
        Node<Integer> v2 = new Node<>(2);
        Node<Integer> v3 = new Node<>(2);
        Node<Integer> v4 = new Node<>(1);
        Node<Integer> v5 = new Node<>(1);
        head.next = v1;
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
        v4.next = v5;
        System.out.println(isPalindrome(head));
    }
    static boolean isPalindrome(Node<Integer> head){
        Node<Integer> middle = findMiddle(head);
        Node<Integer> t2 = reverseLinkedList(middle);
        Node<Integer> t1 = head;

        while ( t2 != null){
            if (t1.val != t2.val){
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }

    static Node<Integer> findMiddle(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
