public class SelectionSort {
    public static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            //finding minimum element index
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            // swap the elements
            if (minIndex != i){   // only execute if the swap needed
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void printArray(int[] array){
        for (int element: array){
            System.out.print(element+ " ");
        }
    }
    public static void main(String[] args) {

        int[] numbers = {5,4,3,2,1};
        selectionSort(numbers);
        printArray(numbers);

    }
}
