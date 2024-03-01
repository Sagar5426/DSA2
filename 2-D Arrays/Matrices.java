import java.util.Scanner;

public class Matrices{

    public static boolean matrixSearch(int[][] matrix, int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key){
                    System.out.println("found at cell ("+i+ ","+j+")" );
                    return true;
                }
            }
        }
        return false;
    }

    public static void minAndMaxNumOfMatrix(int[][] matrix){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(matrix[i][j],max);
                min = Math.min(matrix[i][j],min);
            }

        }
        System.out.println("Minimum value: "+ min);
        System.out.println("Maximum value: "+ max);
    }

    public static void main(String[] args){

        int matrix[][] = new int[4][3];
        int n = matrix.length;    //4
        int m = matrix[0].length; //3

        System.out.print("Enter the numbers of matrix upto "+ (n*m) + " cells: ");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        matrixSearch(matrix,5);
        minAndMaxNumOfMatrix(matrix);
    }
}