package data_structure_and_algorithm.Queue;

public class MainClassQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.peek());
        queue.printQueue();
        System.out.println(queue.dequeue());
        queue.printQueue();

    }
}
