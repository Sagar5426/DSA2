import java.util.Arrays;

public class ifAnagrams {
    public static void anagrams(String str1, String str2){
        //Convert these strings to lowerCase. Why? so that we don't have to check separately
        // for lowerCase and UpperCase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //First check - if lengths are same
        if (str1.length() == str2.length()){
            //convert these string into char array
            char[] str1CharArr = str1.toCharArray();
            char[] str2CharArr = str2.toCharArray();
            //sort the char array
            Arrays.sort(str1CharArr);
            Arrays.sort(str2CharArr);
            // if the sorted char array are same or identical then the strings are anagrams
            boolean result = Arrays.equals(str1CharArr,str2CharArr);
            if (result){
                System.out.println(str1+ " and "+str2+ " are Anagrams!");
            }else{
                System.out.println(str1+ " and "+str2+ " are not Anagrams!");
            }
        }else {
            System.out.println(str1+ " and "+str2+ " are not Anagrams!");
        }
    }
    public static void main(String[] args) {

        String str1 = "earth", str2 = "heart";
        anagrams(str1,str2);
        anagrams("race","care");
        anagrams("cast","fast");

    }
}
