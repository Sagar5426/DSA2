public class oddOrEven {
    public static void oddOrEven(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(4);
        oddOrEven(3);
        oddOrEven(7);
    }
}
