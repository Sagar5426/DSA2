public class DoubleLL {

    public static Node head;
    public static Node tail;
    public static int size;

    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // add
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //remove
    public int deleteAtFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //print
    public void print() {
        Node temp = head;
        System.out.print("List: null<-> ");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL doubleLL = new DoubleLL();
        doubleLL.insertAtFirst(3);
        doubleLL.insertAtFirst(2);
        doubleLL.insertAtFirst(1);
        doubleLL.print();
    }
}
