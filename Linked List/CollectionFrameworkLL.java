import java.util.LinkedList;

public class CollectionFrameworkLL {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        //print
        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeFirst();
        ll.removeFirst();
        System.out.println(ll);



    }
}
