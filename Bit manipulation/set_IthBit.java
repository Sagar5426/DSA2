public class set_IthBit extends Get_IthBit {

    //Convert bit at ith position to 1
    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(setIthBit(10,2));
    }
}
