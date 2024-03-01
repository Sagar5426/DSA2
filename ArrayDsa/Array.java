import java.util.Scanner;
import java.util.*;


public class Array {
    // List of items of the same type
    public static void main(String[] args) {

//        // declaration and memory allocation
//        int[] marks = new int[3];
//        marks[0] = 97; //phy    //initialization
//        marks[1] = 98; //chem
//        marks[2] = 95; // eng
//        for (int i = 0; i < marks.length; i++) {
//        System.out.println(marks[i]);
//        }
//
//        // Declare and Initialize
//        int[] myMarks = {99,85,73};

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the "+(i+1)+" element: ");
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < size; i++) {
        System.out.print(numbers[i]+"  ");
        }

        // Quiz: To check if a number x entered by user is present in array
        // Linear Search

        System.out.println();
        System.out.print("Enter the number x: ");
        int x = scan.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (x==numbers[i]){
                System.out.println("Number found at index "+i);
            }
        }
    }
}
