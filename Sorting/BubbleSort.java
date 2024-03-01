public class BubbleSort {
    public static void bubbleSort(int[] array){

        boolean isSwapped;
        int numOfSwap = 0 ;
        int n = array.length;

        // Loop runs for n-1 [i.e. till n-2 index] passes as the
        // largest element is guaranteed to be at the end after each pass.
        // turn < n-1  <--is equal to--> turn <= n-2
        for (int turn = 0; turn < n-1; turn++) {
            isSwapped = false;
            for (int j = 0; j < n-1-turn; j++) {
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                    numOfSwap++;
                }
            }
            //agar loop sorted hai pehle se to value evaluates to TRUE and loop breaks
            // agar ek bhi baar swap hua isSwapped = True hoga or vapas se false(bcz !isSwapped)
            // evaluated ho jayega and loop will run again
            if (!isSwapped) break; //if its value evaluated to true means array is already sorted
        }
            System.out.println("Number of Swaps: "+ numOfSwap);
    }
    public static void printArray(int[] array){
        for (int element: array){
            System.out.print(element+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int arr2[] = {1,2,3,5,4};

        bubbleSort(arr);
        bubbleSort(arr2);
        printArray(arr);

    }
}
