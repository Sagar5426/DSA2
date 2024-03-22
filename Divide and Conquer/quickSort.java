public class quickSort {

    // Function to print the elements of an array
    public static void printArray(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to perform quick sort
    public static void quickSort(int arr[], int si, int ei){
        // Base case: If the start index is greater than or equal to the end index, return
        if (si >= ei) return;

        // Partition the array and get the pivot index
        int pivotIndex = partition(arr, si, ei);

        // Recursively sort the left part of the array
        quickSort(arr, si, pivotIndex - 1); // Left part
        // Recursively sort the right part of the array
        quickSort(arr, pivotIndex + 1, ei); // Right part
    }

    // Function to partition the array
    public static int partition(int arr[], int si, int ei){
        // Choose the pivot as the last element of the array
        int pivot = arr[ei];
        // Initialize an index to track elements smaller than pivot
        int i = si - 1; // 0 - 1 = -1

        // Iterate through the array
        for (int j = si; j < ei; j++) {
            // If the current element is less than or equal to the pivot
            if (arr[j] <= pivot){
                // Increment the index of smaller elements
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Move the pivot element to its correct position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        // Return the index of the pivot element
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
