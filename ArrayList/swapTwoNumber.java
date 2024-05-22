import java.util.ArrayList;

public class swapTwoNumber {

    public static void swapTwoNumber(ArrayList<Integer> arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2,temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            arr.add(i);
        }

        System.out.println(arr);

        swapTwoNumber(arr,0,2);
        System.out.println("After Swap: "+ arr);


    }
}
