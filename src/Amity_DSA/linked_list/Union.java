package Amity_DSA.linked_list;

class NodeUni {
    int data;
    NodeUni next;

    public NodeUni(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListUni {
    NodeUni head;

    public void addToEnd(int data) {
        NodeUni newNode = new NodeUni(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeUni current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        NodeUni current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static LinkedListUni union(LinkedListUni list1, LinkedListUni list2) {
        LinkedListUni result = new LinkedListUni();

        // Add elements from the first list
        NodeUni current1 = list1.head;
        while (current1 != null) {
            result.addToEnd(current1.data);
            current1 = current1.next;
        }

        // Add unique elements from the second list
        NodeUni current2 = list2.head;
        while (current2 != null) {
            if (!result.contains(current2.data)) {
                result.addToEnd(current2.data);
            }
            current2 = current2.next;
        }

        return result;
    }

    private boolean contains(int data) {
        NodeUni current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

public class Union {
    public static void main(String[] args) {
        LinkedListUni list1 = new LinkedListUni();
        list1.addToEnd(1);
        list1.addToEnd(2);
        list1.addToEnd(3);

        LinkedListUni list2 = new LinkedListUni();
        list2.addToEnd(3);
        list2.addToEnd(4);
        list2.addToEnd(5);

        System.out.println("List 1: ");
        list1.display();

        System.out.println("List 2: ");
        list2.display();

        LinkedListUni unionList = LinkedListUni.union(list1, list2);

        System.out.println("Union of List 1 and List 2: ");
        unionList.display();
    }
}
//This program defines a `Node` class to represent elements in the linked list and a `LinkedList` class with methods to add elements to the end of the list, display the list, and find the union of two linked lists. The `union` method creates a new linked list and adds elements from both input lists while ensuring that duplicates are not included. The `contains` method checks whether a given element is already present in the list. The `main` method demonstrates the usage of the `union` method.

