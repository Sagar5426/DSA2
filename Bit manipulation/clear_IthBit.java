public class clear_IthBit extends set_IthBit{
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(10,1));
    }
}
