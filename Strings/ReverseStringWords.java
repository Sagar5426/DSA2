public class ReverseStringWords {

    public static String reverseStrWord(String str){
        String[] words = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            if (words[i].length() > 0){
                sb.append(words[i]);
                sb.append(' ');
            }
        }
        return sb.substring(0, sb.length()-1).toString();
    }


    public static void main(String[] args) {
        String str = "I am a Star"; //Star a am I
        System.out.println(reverseStrWord(str));

    }
}
