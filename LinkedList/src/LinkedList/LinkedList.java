package LinkedList;

public class LinkedList<T> {
    // Properties
    Node<T> head;
    int count;

    // Constructors
    public LinkedList() {
        head = null;
        count = 0;
    }

    public LinkedList(Node<T> head) {
        this.head = head;
        count = 1;
    }

    // Methods

    // Add
    public void add(T data) {
        Node<T> newNode = new Node(data);

        if (count == 0) {
            head = newNode;
        } else {
            Node<T> current = head;

            // find the end of the list
            while(current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

        count++;
    }

    // Get
    public T get(int index) {
        Node<T> current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }

    // size
    public int size() {
        return count;
    }

    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // remove
    public void remove() {
        Node current = head;

        if (count > 1) {
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
        }

        current.setNext(null);
        count--;
    }
}
