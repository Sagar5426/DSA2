public class isSortedArray {
    public static Boolean isSorted(int arr[],int i){
        if (i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int num1[] = {1,2,3,4};
        System.out.println(isSorted(num1,0));
        int num2[] = {1,2,5,3};
        System.out.println(isSorted(num2,0));
        int num3[] = {3};
        System.out.println(isSorted(num3,0));
    }
}
