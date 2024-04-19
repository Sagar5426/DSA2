public class prac {

    public static int[] rotateArray(int arr[],int k){
        int n = arr.length;
        int newArr[] = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[k];
            k = (k+1)%n;
        }
        return newArr;
    }
    public static void printArr(int arr[]){
        for(int element:arr){
            System.out.print(element+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int rotatedArr[] = rotateArray(arr,2);
        printArr(rotatedArr);

    }
}
