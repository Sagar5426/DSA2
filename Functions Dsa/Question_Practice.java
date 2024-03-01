import java.util.Scanner;
import java.util.*;

public class Question_Practice {

    //1. Enter 3 numbers from the user & make a function to print their average.
//    public int average(int a, int b, int c){
//
//        return (a+b+c)/3;
//    }
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter the first number:");
//        int a = scan.nextInt();
//        System.out.println("enter the second number:");
//        int b = scan.nextInt();
//        System.out.println("enter the third number:");
//        int c = scan.nextInt();
//        scan.close();
//        System.out.println("The average of three number is: "+ (a+b+c)/3);
//    }

    //2. Write a function to print the sum of all odd numbers from 1 to n.

//    public static void sum_all_odd(int n){
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//        if ( i%2 != 0){
//            sum = sum+i;
//        }
//        }
//        System.out.println("The sum of all odd number between 0 and "+n+" is: "+ sum);
//    }
//
//    public static void main(String[] args) {
//        sum_all_odd(5);
//
//    }

    //3. Write a function which takes in 2 numbers and returns the greater of those two.

//    static void greater_num(int a, int b){
//        if (a>b){
//            System.out.println(a+1);
//        }
//        else {
//            System.out.println(b+1);
//        }
//    }
//
//    public static void main(String[] args) {
//        greater_num(5,8);
//    }


    //4. Write a function that takes in the radius as input and returns the circumference of a circle

//    public static void circumferenceOfCircle(int radius){
//        System.out.println(2*Math.PI*radius);
//    }
//
//    public static void main(String[] args) {
//        circumferenceOfCircle(5);
//    }

 //5.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

//public static void voting_Eligibility(){
//    System.out.println("Enter your age: ");
//    Scanner scan = new Scanner(System.in);
//    int age = scan.nextInt();
//    if (age>=18){
//        System.out.println("Yes, you can vote!");
//    }
//    else {
//        System.out.println("No, you can't vote!");
//    }
//}
//    public static void main(String[] args) {
//        voting_Eligibility();
//    }

    // 6. Write an infinite loop using do while condition.

//    public static void infiniteLoop(int n){
//        do {
//            System.out.println(n);
//        }
//        while (n>0);{
//            System.out.println("infinite");
//        }
//    }
//
//    public static void main(String[] args) {
//        infiniteLoop(4);
//    }

    //7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered


//public static void printNumberTillUserWants(){
//
//    Scanner scan = new Scanner(System.in);
//        int number,
//        countPositive = 0,
//        countNegative = 0,
//        countZero = 0;
//
//        char choice;
//
//        do {
//            System.out.println("Enter the number: ");
//            number=scan.nextInt();
//
//            if (number > 0){
//                countPositive++;
//            }
//            else if (number < 0) {
//                countNegative++;
//            }
//            else {
//                countZero++;
//            }
//            System.out.println("Do you want to continue y/n?");
//            choice=scan.next().charAt(0);
//        }
//        while (choice=='y'|| choice == 'Y');
//
//        System.out.println("Positive numbers: "+countPositive);
//        System.out.println("Negative numbers: "+countNegative);
//        System.out.println("Zero numbers: "+countZero);
//    }
//
//    public static void main(String[] args) {
//        printNumberTillUserWants();
//    }


    //8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn

//    public static void numberRaisedToThePower(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number x: ");
//        int number = scan.nextInt();
//        System.out.println("Enter the number to raised to the power n: ");
//        int power = scan.nextInt();
//
//        int product = 1;
//        for (int i = 1; i <= power; i++) {
//            product*=number;
//        }
//        System.out.println("The result of "+ number + " raised to the power "+ power+ " is: "+product);
//    }
//
//    public static void main(String[] args) {
//        numberRaisedToThePower();
//    }

    //9. Write a function that calculates the Greatest Common Divisor(HCF or GCG) of 2 numbers

//    public class HCFExample {
//        public static int HCF(int a, int b) {
//            // Initialize the result to the minimum of 'a' and 'b'
//            int result = Math.min(a, b);
//
//            // Iterate until 'result' is greater than 0
//            while (result > 0) {
//                // Check if both 'a' and 'b' are divisible by 'result'
//                if (a % result == 0 && b % result == 0) {
//                    // 'result' is the HCF, so exit the loop
//                    break;
//                }
//
//                // Decrement 'result' by 1 for each iteration
//                result--;
//            }
//
//            // Return the calculated HCF
//            return result;
//        }
//
//        public static void main(String[] args) {
//            // Initialize the values of 'a' and 'b'
//            int a = 15, b = 5;
//
//            // Print the HCF of 'a' and 'b'
//            System.out.println("The HCF of " + a + " and " + b + " is: " + HCF(a, b));
//        }
//    }

    // 10. Write a program to print Fibonacci series of n terms where n is input by user

    public static int fibonacciNumber(int n) {

        if (n==0){
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else{
            return fibonacciNumber(n - 2) + fibonacciNumber(n - 1);
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter the number till which you want to generate the fibonacci number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Fibonacci sequence up to "+ n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumber(i)+" ");
            // i = 0 , fibonacciNumber(0) = 0
            // i = 1 , fibonacciNumber(1) = 1
            // i = 2 , fibonacciNumber(2) = will enter recursive call fibonacciNumber(0)+fibonacciNumber(1) = 0+1 = 1
            // i = 3 , fibonacciNumber(3) = will enter recursive call fibonacciNumber(1)+fibonacciNumber(2) = 1+1 = 2
//                                          #fibonacciNumber(1)  = 1
//                                          #fibonacciNumber(2)  = 0+1 = 1  // again in recursive as above fibonacciNumber(2) in line 216
            // i = 4 , fibonacciNumber(4) = will enter recursive call fibonacciNumber(2)+fibonacciNumber(3) = 1+2 = 3
//                                          #fibonacciNumber(2)  = 0+1 = 1  // again in recursive as above fibonacciNumber(2) in line 216
//                                          #fibonacciNumber(3)  = 1+1 = 2  // again in recursive as above fibonacciNumber(3) in line 217
            // i = 5 , fibonacciNumber(5) = will enter recursive call fibonacciNumber(3)+fibonacciNumber(4) = 2+3 = 5
//                                          #fibonacciNumber(3)  = 1+1 = 2  // again in recursive as above fibonacciNumber(3) in line 217
//                                          #fibonacciNumber(4)  = 1+2 = 3  // again in recursive as above fibonacciNumber(4) in line 220
        }
    }
}