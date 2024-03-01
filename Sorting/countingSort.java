public class countingSort {
    //time complexity O(n+count)
    public static void countingSort(int[] arr){
        int n = arr.length;
        if (n==0) return; //corner cases

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            largest = Math.max(arr[i],largest);
        }

        //frequency of numbers (can be repeating numbers)
        // Count the occurrences of each element
        int count[] = new int[largest+1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    public static void printArray(int[] array){
        for (int element: array){
            System.out.print(element+ " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = {3,6,2,1,8,7,4,5,3,1};

        countingSort(numbers);
        printArray(numbers);
    }
}
