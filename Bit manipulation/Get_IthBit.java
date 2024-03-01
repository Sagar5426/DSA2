public class Get_IthBit {
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if ((n & bitmask) != 0){
            return 1;
        } else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,1));

    }
}
