package data_structure_and_algorithm.Queue;

public class MyQueue {
    int size;
    private int a[];
    private int front;
    private int rear;

    public MyQueue(int size) {
        this.size = size;
        a = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full can not add new elements");
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        a[rear] = data;
        return true;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty cannot dequeue");
            return -1;
        }
        int temp = a[front];
        if (front == rear) {
            front = rear = -1;
            return temp;
        }
        front++;
        return temp;

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty cannot peek");
            return -1;
        }
        return a[front];

    }
    public void printQueue(){
        if (isEmpty()) return;
        for (int i = front; i <= rear; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
