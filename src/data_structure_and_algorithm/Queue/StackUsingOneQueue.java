package data_structure_and_algorithm.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    private Queue<Integer> q = new LinkedList<>();

    public void push(int data) {
        q.offer(data);
    }

    public int pop() {
        if (q.isEmpty()) return -1;

        int size = q.size();
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
        return q.poll();
    }

}
