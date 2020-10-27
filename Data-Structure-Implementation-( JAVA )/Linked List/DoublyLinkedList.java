
class MyDLL {

    Node head = null;
    int size = 0;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to insert at last
    void insertLast(int data) {
        Node newNode = new Node(data);

        if (size == 0) {
            head = newNode;
            size++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        size++;
    }

    // Method to insert at first
    void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    // Method to remove last node
    void removeLast() {

        if (size < 2) {
            head = null;
            size = 0;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;

    }

    // Method to Reverse List
    void reverse() {
        Node temp = head;
        Node temp2, current = head;
        int i = 0;

        while (temp != null) {
            current = temp;
            temp2 = current.prev;
            temp = current.prev = current.next;
            current.next = temp2;
            System.out.println(i++);
        }
        head = current;
    }

    // Method to print list
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        MyDLL list = new MyDLL();
        list.insertLast(54);
        list.insertLast(3);
        list.insertFirst(8);
        list.insertLast(23);
        list.insertFirst(78);
        list.reverse();
        list.removeLast();
        list.print();
        System.out.println("Size: " + list.size);

    }
}
