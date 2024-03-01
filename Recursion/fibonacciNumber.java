public class fibonacciNumber {
    // without recursion // T.C O(n)
    public static void fibonacciN(int n) {
        int a = 0, b = 1;
        System.out.print(a + " ");
        while (n > 1) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.print(a + " ");
            n--;
        }
    }

    //With Recursion  //T.C = O(n^2) and S.C = O(n)
    public static int fibonacci(int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fib = fnm1 + fnm2;
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
        fibonacciN(20);
    }
}
