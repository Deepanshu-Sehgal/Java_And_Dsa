package data_structure_and_algorithm.Stack;

public class StackUsingArray {
    int size;
    int[] a;
    int top;

    public StackUsingArray(int size) {
        this.size = size;
        a = new int[size];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack Over Flow");
            return false;
        } else {
            top++;
            a[top] = data;
            return true;
        }
    }

    int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty (UnderFlow)");
            return -1;
        }else {
            int temp = a[top];
            top--;
            return temp;
        }
    }
    int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty (UnderFlow)");
            return -1;
        }else {
            return a[top];
        }
    }

    void printStack(){
        for (int i =0;i<=top;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
