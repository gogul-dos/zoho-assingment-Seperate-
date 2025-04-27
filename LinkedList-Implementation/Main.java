public class Main {
    public static void main(String[] args) {
        // Singly Linked List
        System.out.println("Singly Linked List");
        System.out.println();
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.append(10);
        sll.append(20);
        sll.append(30);
        sll.prepend(5);
        sll.print();
        sll.remove(20);
        sll.print();
        System.out.println();
        System.out.println();

        // Doubly Linked List
        System.out.println("Doubly Linked List");
        System.out.println();
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(10);
        dll.append(20);
        dll.prepend(5);
        dll.print();
        dll.printReverse();
        dll.remove(10);
        dll.print();
        System.out.println();
        System.out.println();

        // Circular Linked List
        System.out.println("Circular Linked List");
        System.out.println();
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(10);
        cll.append(20);
        cll.append(30);
        cll.prepend(5);
        cll.print();
        cll.remove(20);
        cll.print();
    }
}
