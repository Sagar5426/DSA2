import java.util.Scanner;

public class hwArray {
    // Q1. Take an array of names as input from the user and print them on the screen.

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = scan.nextInt();
//        String[] names = new String[size];
//
//        // input
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter the "+(i+1)+" name: ");
//            names[i] = scan.next();
//        }
//        // output
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(names[i]+" ");
//        }
//    }

    // Q2. Find the maximum & minimum number in an array of integers by creating a function.

//    public static void main(String[] args) {
//        int[] numbers = {4,34,67,3,78,5,1};
//        MaxAndMinNumber(numbers);
//    }
//    static void MaxAndMinNumber(int[] array){
//        if (array==null || array.length ==0) return; //interview style of writing code
//        int min = array[0];
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            min = Math.min(array[i],min);
//            max = Math.max(array[i],max);
//        }
//        System.out.println("Maximum: " + max);
//        System.out.println("Minimum: " + min);
//    }

    //Q3.Take an array of numbers as input and check if it is an array sorted in ascending order.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] numbers = new int[size];
        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1)+ " element: ");
            numbers[i] = scan.nextInt();
        }
        // for checking
        boolean isAscending = true;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]>numbers[i+1]){
                isAscending=false;
                break;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order.");
        }
        else{
            System.out.println("The array is not sorted in ascending order.");
        }
    }


}
