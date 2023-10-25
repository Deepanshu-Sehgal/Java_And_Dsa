package Amity_DSA.linked_list;

class NodeDel {
    String data;
    NodeDel next;

    NodeDel(String data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletion {
    NodeDel head;

    public void addNode(String data) {
        NodeDel newNode = new NodeDel(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeDel current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void deleteNode(String data) {
        if (head == null) {
            return; // List is empty, nothing to delete.
        }

        if (head.data.equals(data)) {
            head = head.next; // Update the head to remove the first node.
            return;
        }

        NodeDel current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next; // Skip the node to be deleted.
                return;
            }
            current = current.next;
        }
    }

    public void displayList() {
        NodeDel current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Deletion linkedList = new Deletion();

        linkedList.addNode("Apple");
        linkedList.addNode("Banana");
        linkedList.addNode("Cherry");
        linkedList.addNode("Date");

        System.out.println("Original Linked List:");
        linkedList.displayList();

        linkedList.deleteNode("Cherry");

        System.out.println("Updated Linked List:");
        linkedList.displayList();
    }
}


