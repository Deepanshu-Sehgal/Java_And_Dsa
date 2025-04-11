package data_structure_and_algorithm.Stack;

import java.util.ArrayDeque;

public class MainStackClass {
    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(20);
        stack.push(19);
        stack.push(34);
        stack.push(256);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }

        //stack using collection class
        ArrayDeque<Integer> stackAd = new ArrayDeque<>();
        stackAd.push(4);
        stackAd.push(2);
        System.out.println(stackAd.pop());


       /* stackArray.printStack();
        stackArray.push(5);
        stackArray.printStack();
        System.out.println(stackArray.pop());
        stackArray.printStack();*/
    }
}
