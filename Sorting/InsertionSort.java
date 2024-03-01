public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int prevIndex = i-1;
            // finding out correct position to insert
            while (prevIndex >= 0 && arr[prevIndex] > curr){
                arr[prevIndex+1] = arr[prevIndex]; //shifting to right
                prevIndex--;
            }
            //insertion
            arr[prevIndex+1] = curr;
        }
    }

    public static void printArray(int[] array){
        for (int element: array){
            System.out.print(element+ " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5,4,1,2,3};

        insertionSort(numbers);
        printArray(numbers);

    }
}
