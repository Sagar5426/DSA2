import java.util.Scanner;

public class countVowel {
    public static int countVowel(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Words to check no. of vowels in it: ");
        String str = scan.nextLine();

        System.out.println("Total Vowels: "+ countVowel(str));

    }
}
