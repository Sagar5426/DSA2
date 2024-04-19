public class Kadane_MaxSubArraySum {
    public static void kadaneMaxSubArraySum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("max sum:" + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        int negNumbers[] = {-1,-2,-3,-4};
        kadaneMaxSubArraySum(numbers);
        kadaneMaxSubArraySum(negNumbers);
    }
}
// not true for all negative numbers array
//    public static void kadaneMaxSubArraySum(int[] numbers){
//        int currentSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < numbers.length; i++) {
//            currentSum = currentSum + numbers[i];
//            if (currentSum<0){
//                currentSum=0;
//            }
//            maxSum = Math.max(maxSum,currentSum);
//        }
//        System.out.println("max sum: "+maxSum);
