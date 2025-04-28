class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void remove(int data) {
        if (head == null) return;
        if (head.data == data) {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
            return;
        }
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) return;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printReverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    
    public void insertAt(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            prepend(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        
        if (current == null) { 
            append(data);
            return;
        }
        
        Node previous = current.prev;
        previous.next = newNode;
        newNode.prev = previous;
        newNode.next = current;
        current.prev = newNode;
    }
}
