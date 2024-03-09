public class swapArray {
    public static void swap(int arr[], int i){
        int size = arr.length;
        if(i >= size/2){
            return;
        }
        swap(arr,i+1);

        int temp = arr[i];
        arr[i] = arr[size-i-1];
        arr[size-i-1] = temp;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        swap(nums,0);
        for(int elements: nums){
            System.out.print(elements+" ");
        }
    }
}
