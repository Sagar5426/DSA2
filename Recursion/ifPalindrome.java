public class ifPalindrome {

    public static boolean ifPalindrome(int i, String str){
        int size = str.length();
        if (i >= size/2) return true;
        if (str.charAt(i) != str.charAt(size-i-1)) return false;
        return ifPalindrome(i+1,str);
    }
    public static void main(String[] args) {

        System.out.println(ifPalindrome(0,"racecar"));
    }
}
