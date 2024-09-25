import java.util.*;

public class QueueUsingCollectionFramework {
    // The Queue interface cannot be instantiated directly, as we cannot create objects of interfaces.
    // Instead, we create a Queue using the LinkedList class, which implements the Queue interface.

    public static void main(String[] args) {
     // Queue : is Interface and LinkedList is class

        // Two ways to create Queue 1. Using LinkedList, 2. Using ArrayDeque(Better)
//        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
