import java.util.ArrayList;

public class maxInAL {

    public static void maxInElement(ArrayList<Integer> arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max,arr.get(i));
        }
        System.out.println("Max Element: "+ max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);

        maxInElement(arr);
    }
}
