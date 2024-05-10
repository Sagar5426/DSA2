
public class prac {

    public static int search(int arr[], int key, int si, int ei){
        //base case
        if(si > ei) return -1;

        int mid = (si+ei)/2;

        if(arr[mid] == key){
            return mid;
        }
        //L1
        if(arr[si] <= arr[mid]){
            //left
            if(arr[si] <= key && key <= arr[mid]){
                return search(arr,key,si,mid-1);
            }else {
                //right
                return search(arr,key,mid+1,ei);
            }
        } else{
        //L2
            if(arr[mid] <= key && key <= arr[ei]){
                //right
                return search(arr,key,mid+1,ei);
            }else{
                //left
                return search(arr,key,si,mid-1);
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,0,1,2};
        System.out.println(search(arr,2,0,arr.length-1));

    }
}
