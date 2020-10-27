// Implementaion of Queue using Linked List

class MyQ {

    // Initially both points to null
    Node head = null; // front
    Node tail = null; // rear

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add element from Queue (enqueue)
    void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            System.out.println(data + " is inserted");
            return;
        }
        tail.next = newNode;
        System.out.println(data + " is inserted! ");

    }

    // Method to remove element from Queue (dequeue)
    void remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int item = head.data;
        head = head.next;
        System.out.println(item + " is removed! ");

    }

    // Method to check Queue is empty or not
    boolean isEmpty() {
        return (head == null);
    }
}


public class Queue {
    public static void main(String[] args) {
        MyQ myQueue = new MyQ();
        myQueue.add(34);
        myQueue.add(122);
        myQueue.remove();
        myQueue.add(556);
        myQueue.add(34);
        myQueue.add(7);
        myQueue.remove();
    }
}