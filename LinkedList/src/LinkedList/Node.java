package LinkedList;

public class Node<T> {
    Node next;
    T data;

    // Methods

    // Constructors
    public Node(T data) {
        this.data = data;
        next = null;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Setters
    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }

    // Getters
    public Node<T> getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }
}
