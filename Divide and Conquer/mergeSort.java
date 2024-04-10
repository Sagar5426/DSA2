public class mergeSort {
    public static void printArray(int[] arr){
        for (int element: arr){
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int si, int ei){
        //base case
        if (si >= ei) return;
        //kaam
        int mid = (si+ei)/2; // also works with si + (ei - si)/2
        mergeSort(arr,si,mid); // left part
        mergeSort(arr,mid+1,ei); // right part
        merge(arr,si,mid,ei);

    }

    public static void merge(int[] arr, int si, int mid , int ei){
        int[] temp = new int[ei-si+1];
        int i = si; //iterator for left part
        int j = mid+1; //iterator for right part
        int k = 0; // iterator for temp part

        while (i <= mid && j <= ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Left part - if elements remaining in the left array
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        // Right part - if elements remaining in the right array
        while (j <= ei){
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for (int index = 0; index < temp.length; index++){
            arr[si + index] = temp[index];
        }
    }
    public static void main(String[] args) {
        int[] numbers = {6,3,9,5,2,8};
        mergeSort(numbers,0, numbers.length-1);
        printArray(numbers);
    }
}
