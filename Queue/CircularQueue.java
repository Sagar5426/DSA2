public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        boolean isFull() {
            return (rear+1) % size == front;
        }

        //Enqueue: O(1)
        void add(int data) {
            if (isFull()) {
                System.out.println("Queue full");
                return;
            }
            //1st element add
            if (front == -1){
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        // Dequeue: O(1)
        int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int element = arr[front];

            // only one element is present
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return element;
        }

        void printQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i != rear; i = (i+1) % size) {
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[rear]);
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.printQueue();

        System.out.println("After deletion, front = "+q.front +" & rear = "+q.rear);
        q.remove();
        q.remove();
        q.printQueue();

        System.out.println("After inserting new values, front = "+q.front +" & rear = "+q.rear);
        q.add(6);
        q.add(7);
        q.printQueue();

    }
}
