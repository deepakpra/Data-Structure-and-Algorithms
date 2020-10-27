// Implementaion of Stack using Arrays

import java.util.ArrayList;

class MyS {
    // Array to store element of stack
    private ArrayList<Integer> list = new ArrayList<>();

    // method to add element into stack
    void push(int data) {
        list.add(data);
        System.out.println(data + " is Added in Stack");

    }

    // Method to remove top element from Stack
    void pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is Empty! ");
            return;
        }
        Integer item = list.remove(list.size() - 1);
        System.out.println(item + " is Removed from Stack");

    }

    // Method to see top element from stack
    Integer peek() {

        if (list.isEmpty()) {
            System.out.println("Stack is Empty! ");
            return -1;
        }
        return (list.get(list.size() - 1));

    }

    // Method to check stack is empty or not
    boolean isEmpty() {
        return (list.isEmpty());
    }
}

public class Stack {

    public static void main(String[] args) {
        MyS myStack = new MyS();
        myStack.push(45);
        myStack.push(5);
        myStack.push(8);
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());

    }
}