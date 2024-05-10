public class searchInSortedAndRotated {
    public static int search(int arr[], int key, int si, int ei){

        // Base case
        if (si > ei) return -1;

        //kaam
        int mid  = (si+ei)/2;

        if (arr[mid] == key){
            return mid;
        }

        //mid on L1
        if (arr[si] <= arr[mid]){
            //case a: left
            if (arr[si] <= key && key <= arr[mid]){
                return search(arr,key, si, mid-1);
            }else {
                // case b: right
                return search(arr, key, mid+1, ei);
            }
        }
        // mid on L2
        else {
            // case c: right
            if (arr[mid] <= key && key <= arr[ei]){
                return search(arr,key,mid+1,ei);
            }else{
                // case d: left
                return search(arr,key,si,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int key= 0;
        int keyIndex = search(arr,key,0,arr.length-1);
        System.out.println(keyIndex);
    }
}
// T.C : O(log n)
// S.C : O(1)

