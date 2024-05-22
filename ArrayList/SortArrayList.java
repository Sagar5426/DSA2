import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    //Use Collections class
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);

        System.out.println(arr);

        Collections.sort(arr); //ascending order
        System.out.println("After Sorting: "+arr);

        //descending order
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("Reverse Order: "+ arr);
    }
}
