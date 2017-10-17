package LinkedList;

public class LinkedList {
    // Properties
    Node head;
    int count;

    // Constructors
    public LinkedList() {
        head = null;
        count = 0;
    }

    public LinkedList(Node head) {
        this.head = head;
        count = 1;
    }

    // Methods

    // Add
    public void add(int data) {
        Node newNode = new Node(data);

        if (count == 0) {
            head = newNode;
        } else {
            Node current = head;

            // find the end of the list
            while(current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

        count++;
    }

    // Get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }

        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }

        return current.getData();
    }
    // size

    // isEmpty

    // remove
}
