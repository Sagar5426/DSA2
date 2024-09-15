import java.util.Stack;

public class StackUsingCollectionFramework {
    // Question 1
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) return;

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top,s);
    }


    public static void printStack(Stack<Integer> s) {
        System.out.println("Stack in Order");
        for (int i = s.size()-1; i >= 0 ; i--) {
            System.out.println(s.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

//        pushAtBottom(5,s);

        printStack(s);
        System.out.println("After reversing stack");
        reverseStack(s);
        printStack(s);

    }
}
