public class Max_Sub_ArraySum {
    public static void maxSubArraySum(int[] numbers){

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {          //Determine starting value
            int start = i;
            for (int j = i; j < numbers.length ; j++) {     // Determine ending value again and again under for i loop
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end ; k++) {       //print the value inside for j loop
                    //subArray sum
                    currentSum+=numbers[k];
                }
                System.out.println(currentSum);
                if (maxSum<currentSum){
                    maxSum = currentSum;
                }
            }
        }
            System.out.println("Max Sum: "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxSubArraySum(numbers);
    }
}
