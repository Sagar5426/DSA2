
public class LinkedList {
    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // T.C = O(1)
    public void insertAtFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

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

    // T.C = O(1)
    public void insertAtLast(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;

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

    public void insertAtIndex(int data, int index) {

        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        // reach at index-1 pos and then
        // first make new Node's next = temp.next and then
        // second temp.next = New Node
        while (i < index-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int deleteAtFirst(){
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE; 
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteAtLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    // T.C = O(n)
    public void printLL() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        System.out.print("List: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // T.C = O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // not found
        return -1;
    }

    // T.C = O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // now curr is at null so
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        // n is index from right to left direction
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // if we want to delete head
        if (n == sz) {
            head = head.next; // remove First
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n; //node to delete
        Node prev = head;
        while (i < iToFind) { // traversing to get prev node
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // helper function -> Note: Slow-Fast Approach used
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      //+1
            fast = fast.next.next; //+2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;

        // step 3 - check left and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtFirst(1);
        ll.insertAtLast(3);
        ll.insertAtIndex(2,1);


        ll.printLL();
        System.out.println("After Deletion");
        // Garbage collector will automatically delete unwanted node
        ll.deleteAtFirst();
        ll.deleteAtLast();
        ll.deleteAtLast();
        ll.printLL();

        // all prev nodes deleted
        for (int i = 1; i <= 5 ; i++) {
            ll.insertAtLast(i * 10);
        }
        ll.printLL();
        System.out.println(ll.itrSearch(30));

        System.out.println("------------------Reverse---------------");

        ll.reverse();
        ll.printLL();
    }
}
