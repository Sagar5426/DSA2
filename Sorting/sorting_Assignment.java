public class sorting_Assignment {

    public static void bubbleSortDescending(int[] arr){
        int n = arr.length;
        Boolean isSorted;
        int countSort = 0;
        for (int turn = 0; turn < n-1; turn++) {
            isSorted = false;
            for (int j = 0; j < n-1-turn; j++) {
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted=true;
                    countSort++;
                }
            }
            if (!isSorted) break;
        }
        printArray(arr);
    }
    
    public static void selectionSortDescending(int[] arr){
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
        int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] > arr[minIndex]){
                    minIndex = j;
                }
            }

            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            
        }
        printArray(arr);
    }

    public static void insertionSortDescending(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int curr = arr[i];
            int prevIndex = i-1;

            while (prevIndex >= 0 && arr[prevIndex] < curr){
                arr[prevIndex+1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex+1] = curr;
        }
        printArray(arr);
    }

    public static void countingSortDescending(int[] arr) {
        int n = arr.length;
        if (n==0) return;

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printArray(arr);
    }




    public static void printArray(int[] arr){
        for (int element:arr){
            System.out.print(element+ " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3,6,2,1,8,7,4,5,3,1};
//        bubbleSortDescending(numbers);
//        selectionSortDescending(numbers);
//        insertionSortDescending(numbers);
        countingSortDescending(numbers);
    }
}
