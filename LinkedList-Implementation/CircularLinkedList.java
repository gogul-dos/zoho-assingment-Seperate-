class CircularLinkedList {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    
    public CircularLinkedList() {
        this.head = null;
    }


    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
    }


    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void remove(int data) {
        if (head == null) return;
        if (head.data == data) {
            if (head.next == head) {
                head = null;
                return;
            }
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            head = head.next;
            current.next = head;
            return;
        }
        Node current = head;
        while (current.next != head && current.next.data != data) {
            current = current.next;
        }
        if (current.next != head) {
            current.next = current.next.next;
        }
    }


    public void print() {
        if (head == null) return;
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }
}
