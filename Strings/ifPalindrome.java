public class ifPalindrome {
    public static boolean ifPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";

        if (ifPalindrome(str)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("Not a Palindrome!");
        }
    }
}
