public class QueueUsingArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        //enqueue : O(1)
        void add(int data) {
            if (rear == size-1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue: O(n)
        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        int peek() {
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }


        void printQueue(){
            System.out.print("Queue: ");
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        q.printQueue();

        q.remove();
        q.printQueue();
        q.add(1);
        q.printQueue();

    }
}
