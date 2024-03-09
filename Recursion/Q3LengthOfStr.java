public class Q3LengthOfStr {
    // sagar
    // agar (func call 1)
    // gar  (func call 2)
    // ar   (func call 3)
    // r    (func call 4)
    //      (func call 5 = 0; base case meet)

    public static int countLen(String str){
        if(str.length() == 0){
            return 0;
        }
        return countLen(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String name = "sagar";
        System.out.println(countLen(name));

    }
}
