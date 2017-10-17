package LinkedList;

public class Node {
    Node next;
    int data;

    // Methods

    // Constructors
    public Node(int data) {
        this.data = data;
        next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Setters
    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    // Getters
    public Node getNext() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }
}
