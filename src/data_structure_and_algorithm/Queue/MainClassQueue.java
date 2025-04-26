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

//        QueueUsingOneStack qOneStacks = new QueueUsingOneStack();
//        qOneStacks.enqueue(10);
//        qOneStacks.enqueue(20);
//        qOneStacks.enqueue(30);
//        qOneStacks.enqueue(40);
//        System.out.println(qOneStacks.dequeue());
//        System.out.println(qOneStacks.dequeue());
//        System.out.println(qOneStacks.dequeue());
//        System.out.println(qOneStacks.dequeue());
//        System.out.println(qOneStacks.dequeue());

        StackUsingOneQueue stack = new StackUsingOneQueue();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());
        stack.push(30);
        System.out.println(stack.pop());
        stack.push(40);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
