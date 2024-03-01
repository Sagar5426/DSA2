public class DecreasingAndIncreasingNumbers {
    public static void printDecNum(int n){
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDecNum(n-1);
    }
    public static void printIncNum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printIncNum(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        printDecNum(10);
        System.out.println();
        printIncNum(10);
    }
}
