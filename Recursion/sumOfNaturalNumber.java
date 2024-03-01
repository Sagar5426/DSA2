public class sumOfNaturalNumber {
    public static int sumOfNNum(int n){
        if (n == 1) return 1;
        if (n <= 0){
            System.out.println("Natural number starts from 1");
            return 0;
        }
        return n + sumOfNNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNNum(5));
    }
}
