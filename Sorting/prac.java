
public class prac {

    public static void printArray(int[] arr){
        for (int element: arr){
            System.out.print(element+ " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int countSwap = 0;
        Boolean isSwapped;
        for (int turn = 0; turn < n-1; turn++) {
            isSwapped = false;
            for (int j = 0; j < n-1-turn; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                    countSwap++;
                }
            }
            if (!isSwapped) break;
        }
        System.out.println("Total Swaps: " + countSwap);
        printArray(arr);
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            //finding min Index
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

        }
        printArray(arr);
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            int prevIndex = i-1;

            while(prevIndex >= 0 && arr[prevIndex] > curr){
                arr[prevIndex+1] = arr[prevIndex];
                prevIndex--;
            }
            arr[prevIndex+1] = curr;
        }
        printArray(arr);
    }

    public static void countingSort(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(arr[i],largest);
        }
        // frequency of numbers - in index
        int count[] = new int[largest+1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int number[] = {5,4,1,2,3};
//        bubbleSort(number);
//        selectionSort(number);
//        insertionSort(number);
        countingSort(number);
    }
}
