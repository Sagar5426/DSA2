public class BinaryStringProblem {
    public static void printBinString(int n, int lastPlace, StringBuilder str){
        // base case
        if (n == 0){
            System.out.println(str);
            return;
        }

        //kaam
        printBinString(n - 1, 0, new StringBuilder(str).append("0"));
        if (lastPlace == 0){
            printBinString(n - 1, 1, new StringBuilder(str).append("1"));
        }
    }
    public static void main(String[] args) {
        printBinString(3, 0, new StringBuilder());
    }
}
