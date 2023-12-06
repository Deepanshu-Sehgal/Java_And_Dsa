package Amity_DSA;

import java.util.Scanner;

class QueueCls {
    static int front, rear, capacity;
    static int queue[];

    QueueCls(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }


    public static void queueEnqueue(int data)
    {

        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        }

        else {
            queue[rear] = data;
            rear++;
        }

    }


    public static void queueDequeue()
    {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }


        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            if (rear < capacity)
                queue[rear] = 0;


            rear--;
        }
        return;
    }


    public static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (i = front; i < rear; i++) {
            System.out.println("<-- "+ queue[i]);
        }
        return;
    }
}

public class QueuePrac {

    // Driver code
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the queue");
        int size = sc.nextInt();
        QueueCls q = new QueueCls(size);

        System.out.println("Enter 1 for Enqueue");
        System.out.println("Enter 2 for Dequeue");
        System.out.println("Enter 3 for Display");
        int op = sc.nextInt();

        QueueCls.queueDisplay();
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);
        QueueCls.queueDisplay();
        switch (op){
            case 1:{
                System.out.println("Enter value for Enqueueing");
                int val = sc.nextInt();
                QueueCls.queueEnqueue(val);
                QueueCls.queueDisplay();
                break;
            }

            case 2:{
                QueueCls.queueDequeue();
                QueueCls.queueDisplay();
                break;
            }
            case 3:{
                QueueCls.queueDisplay();
            }
            default:
                System.out.println("Error no operation found");
        }



//        q.queueDisplay();
//
//        q.queueDequeue();
//        q.queueDequeue();
//        System.out.println("after two node deletion");
//
//
//        q.queueDisplay();
//
//
//        q.queueFront();
    }
}
