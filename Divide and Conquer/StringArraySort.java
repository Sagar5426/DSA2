import java.util.Arrays;

public class StringArraySort {

    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"abc","aed"};
        System.out.println(arr2[1].compareTo(arr2[0]));
    }

    public static void mergeSort(String[] arr, int si, int ei){
        //base case
        if (si >= ei) return;
        //kaam
        int mid = (si + ei) / 2; // also works with si + (ei - si)/2
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr, si, mid, ei);
    }

    public static void merge(String[] arr, int si, int mid, int ei){
        String[] temp = new String[ei - si + 1];
        int i = si; //iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; // iterator for temp part

        while (i <= mid && j <= ei){
            if (arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            } else {
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
        for (k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
}
