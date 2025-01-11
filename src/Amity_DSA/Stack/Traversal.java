package Amity_DSA.Stack;

class CustomStack {
    private final int maxSize;
    private int top;
    private final int[] stackArray;

    public CustomStack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Stack overflow");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Stack underflow");
            return -1; // Indicates an empty stack
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void traverse() {
        if (!isEmpty()) {
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty");
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.traverse();

        int popped = stack.pop();
        System.out.println("Popped element: " + popped);

        stack.traverse();
    }
}
