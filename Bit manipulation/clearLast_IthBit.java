public class clearLast_IthBit {
    public static int clearLastIthBit(int n, int i){
        int bitmask = (~0)<<i;   // (~0) or -1 is equal to all 1 digits as 11111111
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15,2));
    }
}
