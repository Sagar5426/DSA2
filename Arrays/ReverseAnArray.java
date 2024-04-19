public class ReverseAnArray {
    public static void reverseArray(int[] array){
        int start = 0;
        int end = array.length-1;
        int temp;
        while (start<end){
            temp = array[start];
            array[start]=array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        reverseArray(numbers);
        for(int element : numbers){
            System.out.print(element+ " ");
        }
    }
}
