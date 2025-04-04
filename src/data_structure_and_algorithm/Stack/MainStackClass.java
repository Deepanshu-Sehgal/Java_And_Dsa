package data_structure_and_algorithm.Stack;

public class MainStackClass {
    public static void main(String[] args) {
        StackUsingArray stackArray = new StackUsingArray(4);
        stackArray.push(20);
        stackArray.push(19);
        stackArray.push(34);
        stackArray.push(256);
        stackArray.printStack();
        stackArray.push(5);
        stackArray.printStack();
        System.out.println(stackArray.pop());
        stackArray.printStack();
    }
}
