public class StackUsingLL {

    // LIFO = Last In First Out

    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (isEmpty()) return -1;

            int top = head.data;
            head = head.next;
            return top;
        }

        int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }

        void printStack() {
            Node temp = head;
            System.out.println("Stack in Order");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);


        s.printStack();

        s.pop();
        s.printStack();

        System.out.println("Peek at stack top: "+ s.peek());



    }
}
