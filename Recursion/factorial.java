public class factorial {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            System.out.println("Negative Number factorial not defined");
            return 0;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial: "+factorial(5));

    }
}
