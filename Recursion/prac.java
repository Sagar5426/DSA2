public class prac {

    public static void increasingNumbers(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        increasingNumbers(n-1);
        System.out.print(n + " ");

    }

    public static void decNum(int n){
        if (n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        decNum(n-1);

    }

    public static int factorial(int n){
        if (n==0) {
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }

    public static int fib(int n){
        if (n==0 || n==1) {
            return n;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static int firstOcc(int arr[], int key,int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }

    public static int lastOcc(int arr[], int key, int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if (arr[i] == key && isFound == -1){
            return i;
        }
        return isFound;
    }

    public static int pow(int x, int n){
        if (n == 0){
            return 1;
        }
        int halfPower = pow(x,n/2);
        int totPower = halfPower * halfPower;
        if (n%2 != 0){
            totPower = x * totPower;
        }
        return totPower;
    }

    public static int tile(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        int xnm1 = tile(n-1);
        int xnm2 = tile(n-2);

        int totalWays = xnm1 + xnm2;
        return totalWays;
    }

    public static void remDupStr(String str, int i, StringBuilder sb, boolean map[]){
        if (i == str.length()){
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(i);
        if (map[currChar - 'a'] == true){
            remDupStr(str,i+1,sb,map);
        }else{
            map[currChar - 'a'] = true;
            remDupStr(str,i+1,sb.append(currChar),map);
        }
    }

    public static int friendsPairingProblem(int n){
        if (n==0 || n==1 || n==2){
            return n;
        }
        //single
        int fnm1 = friendsPairingProblem(n-1);
        // pair
        int fnm2 = friendsPairingProblem(n-2);
        int pairWays = (n-1)*fnm2;

        return fnm1 + pairWays;
    }

    public static void binString(int n, int lastPlace, StringBuilder sb){
        if (n==0){
            System.out.println(sb);
            return;
        }
        binString(n-1,0,new StringBuilder(sb).append("0"));
        if (lastPlace == 0){
            binString(n-1,1,new StringBuilder(sb).append("1"));
        }
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n==1){
            System.out.println("Transfer disk "+ n + " from " + src + " to " + dest);
            return;
        }
        // transfer n-1 disk from src to helper using dest as 'helper'
        towerOfHanoi(n-1,src,dest,helper);
        // transfer nth disk from src to dest
        System.out.println("Transfer disk "+ n + " from " + src + " to " + dest);
        // transfer n-1 disk from helper to dest using source as 'helper'
        towerOfHanoi(n-1,helper,src,dest);
    }


    public static void main(String[] args) {

        towerOfHanoi(3,"A","B","C");
    }
}
