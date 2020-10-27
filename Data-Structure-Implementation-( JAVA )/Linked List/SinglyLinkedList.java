
class MySLL {

    Node head = null;
    int size = 0;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert at last
    void addLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            size++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    // method to insert at first
    void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Method to Insert at specific position
    void addPos(int data, int pos) {
        Node newNode = new Node(data);
        Node temp = head;
        while (pos-- > 2) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;

    }

    // Method to remove from last
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

    // Method to check list is empty or not
    Boolean isEmpty() {
        return head == null;
    }

    // Method to print List
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

// Main driver class
public class SinglyLinkedList {

    // Main method
    public static void main(String[] args) {
        MySLL list = new MySLL();
        list.addLast(12);
        list.addLast(23);
        list.addFirst(1);
        list.addFirst(165);
        list.addPos(3, 3);
        list.removeLast();
        list.print();
        System.out.println(list.isEmpty() + " " + list.size);

    }
}