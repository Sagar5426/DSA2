// Iterative java program to reverse an
// array
public class GFG {

    /* Function to reverse arr[] from
        start to end*/
    static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int temp;

        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static Boolean isPrime(int n){
        if(n==2) return true;
        for (int i = 2; i < n-1; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1};
        reverseArray(array);
        for( int element:array){
            System.out.print(element+" ");

            System.out.println("______________");

            int a = 10;
            float b = 20.25f;
            long c = 25;
            double d = 30;
//            int ans = a+b+c+d; //wrong can't convert double(a+b+c+d) to int ans
            double ans = a+b+c+d;
            System.out.println(ans);

            System.out.println("______________");
            System.out.println(isPrime(2));

        }
    }




}
//

