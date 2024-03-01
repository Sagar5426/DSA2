public class PracSheet_Q2 {
//    Question 2: Print out the sum of the numbers in the second row of the "nums" array.
//            Example:
//    Input - int[][] nums = { {1,4,9}{11,4,3),{2,2,3} };
//    Output - 18

    public static void rowSum(int matrix[][],int rowIndex){
        int sum = 0;
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==rowIndex){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("Sum: "+sum);

    }


    public static void main(String[] args) {
        int[][] matrix = {{1,4,9},
                          {11,4,3},
                          {2,2,3}};
        rowSum(matrix,1);
    }
}
