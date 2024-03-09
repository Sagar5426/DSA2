public class friendsPairingProblem {
    public static int friendPairProblem(int n){
        // base case
        if(n==0|| n==1|| n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = friendPairProblem(n-1);

        //pair
        int fnm2 = friendPairProblem(n-2);
        int pairways = (n-1)* fnm2;

        int totalWays = fnm1+ pairways;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendPairProblem(3));
        // a,b,c -> total 4 possible cases
        //   i)  a,(b,c)
         // ii) (a,b),c
        // iii) (a,c),b
        //  iv)  a,b,c -all alone
    }}
