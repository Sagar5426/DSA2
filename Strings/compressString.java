public class compressString {
    public static String compressString(String str){
        StringBuilder compStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            // Integer(object) used instead of int, so we can convert it to string
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            compStr.append(str.charAt(i));
            if (count > 1){
                compStr.append(count); //I can add Integer to StringBuilder
                // int and Integer are different
            }
        }
        return compStr.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccc";
        String str2 = "abc";

        System.out.println(compressString(str));
        System.out.println(compressString(str2));

    }
}
