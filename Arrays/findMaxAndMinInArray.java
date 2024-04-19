public class findMaxAndMinInArray {
    public static void findMaxAndMinInArray(int[] array){
        if (array == null || array.length == 0) return; //interview style

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i],max);
            min = Math.min(array[i],min);
        }
        System.out.println("The maximum number is: "+ max);
        System.out.println("The minimum number is: "+ min);
    }

    public static void main(String[] args) {
        int numbers[] = {8,4,3,45,67,21};
        int numbers2[] = { }; //empty
        findMaxAndMinInArray(numbers);
        findMaxAndMinInArray(numbers2);
    }
}
