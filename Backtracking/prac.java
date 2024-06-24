public class prac {
    public static void printArr(int arr[]){
        for(int element: arr){
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[],int i, int val){
        if (i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr,i+1,val+1); // recursion
        arr[i] = arr[i] - 2;  // backtracking
    }

    public static void findSubsets(String str, StringBuilder sb, int i){
        //base case
        if(i == str.length()){
            if(sb.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(sb);
            }
            return;
        }

        //yes
        sb.append(str.charAt(i));
        findSubsets(str,sb,i+1); // recursion
        sb.deleteCharAt(sb.length() - 1); // backtracking

        //no
        findSubsets(str,sb,i+1);

    }

    static int count = 0;
    public static void findPermutations(String str, StringBuilder sb){

        //base case
        if (str.length() == 0){
            System.out.println(sb);
            count++;
            return;
        }


        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            sb.append(curr);
            findPermutations(newStr,sb); //recursion
            sb.deleteCharAt(sb.length()-1); //backtrack
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("---------------Chess Board-----------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q'){
                return false;
            }
        }
        //diag left up
        for (int i = row-1, j = col-1; i >= 0 && j >= 0 ; i--, j--) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        //diag right up
        for (int i = row-1, j = col+1; i >= 0 && j < board.length ; i--,j++) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][],int row){
        if(row == board.length){
            printBoard(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueens(board,row+1); //recursion
                board[row][j] = 'x';
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board,0);
        System.out.println("Count: "+count);
    }
}
