public class findSubSets {

//    public static void findSubsets(String str,String ans,int i){
//        //base case
//        if (i == str.length()){
//            if (ans.length()==0){
//                System.out.println("null"); //for last empty case
//            }else{
//            System.out.print(ans+", ");
//            }
//            return;
//        }
//        //Yes choice
//        findSubsets(str,ans+str.charAt(i),i+1);
//        //No Choice
//        findSubsets(str,ans,i+1);
//    }

    public static void findSubsets(String str, StringBuilder ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // for last empty case
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Yes choice
        ans.append(str.charAt(i));
        findSubsets(str, ans, i + 1);
        ans.deleteCharAt(ans.length() - 1); //backtracking step

        // No Choice
        findSubsets(str, ans, i + 1);
    }
    public static void main(String[] args) {
        String str = "abc";
//        findSubsets(str,"",0);
        findSubsets(str,new StringBuilder(),0);
    }
}
