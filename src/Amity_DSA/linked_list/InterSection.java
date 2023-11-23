package Amity_DSA.linked_list;

//To find the intersection point of two linked lists in Java, you can use the following approach. Assuming you have a `Node` class representing the nodes of the linked list, you can create a method that takes two linked lists as parameters and returns the intersection point:

        //```java
class NodeInetr {
    int data;
    NodeInetr next;

    public NodeInetr(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InterSection {

    public static NodeInetr findIntersection(NodeInetr head1, NodeInetr head2) {
        int len1 = getLength(head1);
        int len2 = getLength(head2);

        int diff = Math.abs(len1 - len2);

        NodeInetr current1 = head1;
        NodeInetr current2 = head2;

        // Move the pointer of the longer list to make both lists equal in length
        if (len1 > len2) {
            for (int i = 0; i < diff; i++) {
                current1 = current1.next;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                current2 = current2.next;
            }
        }

        // Move both pointers until they meet at the intersection point
        while (current1 != null && current2 != null) {
            if (current1 == current2) {
                return current1; // Intersection point found
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return null; // No intersection point found
    }

    // Helper method to get the length of a linked list
    private static int getLength(NodeInetr head) {
        int length = 0;
        NodeInetr current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        // Example usage
        NodeInetr commonNodeInetr = new NodeInetr(7);

        NodeInetr head1 = new NodeInetr(3);
        head1.next = new NodeInetr(1);
        head1.next.next = commonNodeInetr;
        head1.next.next.next = new NodeInetr(9);
        head1.next.next.next.next = new NodeInetr(5);

        NodeInetr head2 = new NodeInetr(4);
        head2.next = new NodeInetr(6);
        head2.next.next = commonNodeInetr;

        NodeInetr intersection = findIntersection(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection point data: " + intersection.data);
        } else {
            System.out.println("No intersection point");
        }
    }
}
//```

     //   In this example, `findIntersection` is the method that takes two linked lists as parameters and returns the intersection point. The `getLength` method is a helper method to find the length of a linked list. The `main` method demonstrates how to use the `findIntersection` method with an example.
