public class optimizedPowerMultiple {
    // T.C = O(log n)
    public static int optimisePower(int x, int n){
        if (n == 0){
            return 1;
        }
        int halfPower =  optimisePower(x,n/2);
        int halfPowerSq = halfPower*halfPower;
        // if n(power) is odd
        if (n%2 != 0){
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(optimisePower(x,n));
    }
}
