public class ifNumPowerOf2 {
    public static boolean ifNumOfPower2(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(ifNumOfPower2(4));
        System.out.println(ifNumOfPower2(7));
    }
}

// 2^1 = 2       //0010
// 2^2 = 4       //0100
// 2^3 = 8       //1000
// 2^4 = 16     //10000
