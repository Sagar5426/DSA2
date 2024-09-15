import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        void push(int data) {
            list.add(data);
        }

        // pop
        int pop() {
            if (isEmpty()) return -1;

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek
        int peek() {
            if (isEmpty()) return -1;

            return list.get(list.size()-1);
        }

        void printStack() {
            System.out.println("Stack in Order");
            for (int i = list.size()-1; i >= 0; i--) {
                System.out.println(list.get(i));
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
        s.pop();
        s.printStack();



    }
}
