public class LinkedList {
    public static Node head;
    public static Node tail;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void insertAtFirst(int data) { // T.C = O(1)
        // Step 1: Create a new node
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, both head and tail should point to the new node
            head = tail = newNode;
            return;
        }
        // Step 2: Set the newNode's next to the current head
        newNode.next = head;
        // Step 3: Update the head to be the newNode
        head = newNode;
    }

    public static void insertAtLast(int data) { // T.C = O(1)
        // Step 1: Create a new node
        Node newNode = new Node(data);

        if (head == null) {
            // If the list is empty, both head and tail should point to the new node
            head = tail = newNode;
            return;
        }

        // Step 2: Set the tail's next to the newNode
        tail.next = newNode;
        // Step 3: Update the tail to be the newNode
        tail = newNode;
    }

    public static void insertAtIndex(int data, int index) {

        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < index-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void printLL(Node head) { // T.C = O(n)
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(1);
        ll.insertAtFirst(2);
        ll.insertAtLast(3);

        printLL(head);
    }
}
