public class fastExponentiation {

    // Time Complexity: O(log n + 1) ~~ O(log n)
    public static int fastExpo(int num, int power){
        int ans = 1;
        while (power > 0){
            if ((power & 1) != 0){ //check LSB
                ans = ans * num;
            }
            num = num * num;
            power = power>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5,3));
        System.out.println(fastExpo(3,5));
    }
}
