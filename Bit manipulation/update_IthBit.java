public class update_IthBit extends clear_IthBit{
    // n = number, i = position, newBit = 0 or 1
    public static int update_IthBit(int n, int i, int newBit){
//        if (newBit == 0){
//            return clearIthBit(n,i);
//        }else {
//            return setIthBit(n,i);
//        }
        int bitMask = newBit << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(update_IthBit(10,2,1));
    }
}
