public class new_Question {
    // To check if a number is prime
    public static boolean isPrime(int n){
        if(n==2) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {   // i <= n-1
            if (n%i==0){     // but we will use Math.sqrt(n) because factor of a number is not greater than its square root
                return false;
            }
        }
        return true;
    }
    // Printing prime numbers in a range
    public static void printPrimeInRange(int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 2; i < 5; i++) {
            System.out.println(i+" ");
        }
            System.out.println(isPrime(6));
            printPrimeInRange(10);
    }
}
