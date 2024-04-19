public class secondLargest {
    public static int[] secondLargestAndSmallest(int[] arr){
        int sLargest = secondLargest(arr);
        int sSmallest = secondSmallest(arr);
        int[] result = new int[2];
        result[0] = sLargest;
        result[1] = sSmallest;

        return result;
    }
    public static int secondLargest(int[] arr){
        int largest = arr[0], sLargest = Integer.MIN_VALUE; //If we take -1 as sLargest means assuming that there are no -ve number in array
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] > sLargest && arr[i] < largest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    public static int secondSmallest(int[] arr){
        int smallest = arr[0], sSmallest = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            if (arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < sSmallest && smallest < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 7, 7, 5};
        int[] result = secondLargestAndSmallest(numbers);
        for(int element: result){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Second largest: " + result[0]);
        System.out.println("Second smallest: " + result[1]);
    }
}