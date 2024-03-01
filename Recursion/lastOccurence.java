public class lastOccurence {

    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,1,7};
        System.out.println(lastOccurence(num,1,0));
        System.out.println(lastOccurence(num,5,0));

    }
}
