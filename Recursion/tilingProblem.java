public class tilingProblem {
    public static int possibleTiles(int n){
        // Base Case
        if (n==0 || n==1){  // n==0 is 1 bcz not fitting tile is also a way to satisfy condition
            return 1;
        }
        // Kaam
        //vertical choice
        int fnm1 = possibleTiles(n-1);
        // horizontal choice
        int fnm2 = possibleTiles(n-2);

        int totalWays = fnm1+fnm2;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(possibleTiles(3));
    }
}
