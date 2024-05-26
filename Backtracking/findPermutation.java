public class findPermutation {

    // T.C = O(n * n!)
    public static void findPermutation(String str, StringBuilder ans) {
        if (str.length() == 0) {
            System.out.println(ans.toString());
            return;
        }
        // recursion -> for each call - loop will run separately
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1); // deleting current char
            ans.append(curr); // adding current char to ans
            findPermutation(newStr, ans); // updating newStr and ans
            ans.deleteCharAt(ans.length() - 1); // removing last char for backtracking
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, new StringBuilder());
    }
}
