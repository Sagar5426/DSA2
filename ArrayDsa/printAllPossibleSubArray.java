public class printAllPossibleSubArray {
    public static void printSubArray(int[] numbers){
        int totalSubArray = 0;
        for (int i = 0; i < numbers.length; i++) {          //Determine starting value
            int start = i;
            for (int j = i; j < numbers.length ; j++) {     // Determine ending value again and again under for i loop
                int end = j;
                for (int k = start; k <= end ; k++) {       //print the value inside for j loop
                    System.out.print(numbers[k]+" ");
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray's: "+ totalSubArray);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }
}
