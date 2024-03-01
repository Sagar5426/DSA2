public class firstLetterToUpperCase {
    public static String firstLetterToUpperCase(String str){
        StringBuilder strBuilder = new StringBuilder("");
        // first letter capital
        strBuilder.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                strBuilder.append(str.charAt(i)); //print spaces
                i++;                             //capitalize next character after space
                strBuilder.append(Character.toUpperCase(str.charAt(i)));
            }else{
                strBuilder.append(str.charAt(i));
            }
        }
        return strBuilder.toString(); //only works when we typecast object and not with datatype
    }
    public static void main(String[] args) {
        String str = "hi i am sagar";
        System.out.println(firstLetterToUpperCase(str));
    }
}
