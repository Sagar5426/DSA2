public class PracSheet_Q1 {

//    Question 1: Print the number of 7's that are in the 2d array.
//    Example:
//    Input - int[][] array = { {4,7,8),{8,8,7};
//    Output-2
    public static void digitCount(int[][] matrix,int key){
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==key){
                    count++;
                }
            }

        }
        System.out.println("Digit Count: "+count);
    }

    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                          {8,8,7}};

        digitCount(matrix,7);
    }
}
