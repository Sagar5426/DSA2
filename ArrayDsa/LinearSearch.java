

public class LinearSearch {

    public static void strLinearSearch(String[] strArray, String key){
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(key)){
                System.out.println("Found key at index: "+ i);
                return;
            }
        }
        System.out.println("Key not found");
    }
    public static int linearSearch(int[] numArray, int number){
        for (int i = 0; i < numArray.length ; i++) {
            if (numArray[i]==number){
                return i;
            }
        }
        return -1; // means not present in array
    }
    public static void main(String[] args) {

        int[] numbers = {2,4,6,8,10,12,14,16};
        String[] menu = {"samosa","kachori","bread pakoda","chole bhature"};
        int target = 10;

        int index = linearSearch(numbers,target);
        if (index==-1){
            System.out.println("Number not found");
        }
        else {
            System.out.println("Number found at index: " + index);
        }

        strLinearSearch(menu,"chole bhature");


    }
}
