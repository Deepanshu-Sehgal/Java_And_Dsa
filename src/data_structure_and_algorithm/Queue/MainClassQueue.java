package data_structure_and_algorithm.Queue;

public class MainClassQueue {
    public static void main(String[] args) {
//        MyCircularQueue queue = new MyCircularQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.printQueue();
//        System.out.println(queue.peek());
//        queue.printQueue();
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        queue.enqueue(80);
//        queue.enqueue(90);
//        queue.printQueue();

        QueueUsingTwoStacks qTwoStacks = new QueueUsingTwoStacks();
        qTwoStacks.enqueue(10);
        qTwoStacks.enqueue(20);
        qTwoStacks.enqueue(30);
        qTwoStacks.enqueue(40);
        System.out.println(qTwoStacks.dequeue());
        System.out.println(qTwoStacks.dequeue());
        System.out.println(qTwoStacks.dequeue());
        System.out.println(qTwoStacks.dequeue());
        System.out.println(qTwoStacks.dequeue());

    }
}
