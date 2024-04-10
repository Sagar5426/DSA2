import java.util.Arrays;

public class prac {


    public static void mergeSort(String arr[], int si, int ei){
        if (si >= ei) return;
        int mid = (si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }

    public static void merge(String arr[], int si, int mid, int ei){
        String[] temp = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei){
            if (arr[i].compareTo(arr[j]) < 0){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= ei){
            temp[k++] = arr[j++];
        }
        for (int index = 0; index < temp.length; index++) {
            arr[si+index] = temp[index];
        }

    }



    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
