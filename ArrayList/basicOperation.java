import java.util.ArrayList;

public class basicOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Float> list4 = new ArrayList<>();

        // add operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(5,6);

        System.out.println(list);

        //get operation - O(1)
        System.out.println(list.get(2));

        //remove operation - O(n)
        list.remove(2);
        System.out.println(list);

        // Set Element at Index operation - O(n)
        list.set(2,10);
        System.out.println(list);

        // contains - O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));

    }
}
