public class firstOccurence {
    public static int firstOccurence(int[] arr, int key, int i){
        if (i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,43,21,13};
        System.out.println(firstOccurence(numbers,13,0));
    }
}
