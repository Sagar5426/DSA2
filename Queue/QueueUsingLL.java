public class QueueUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        boolean isEmpty() {
            return head == null && tail == null;
        }

        void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;

            if (head == tail) {
                tail = head = null;
            }
            head = head.next;
            return front;
        }

        int peek() {
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            System.out.print("Queue: ");
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.printQueue();
    }
}
