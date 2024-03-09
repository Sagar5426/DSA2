public class sortedAndRotated {
    public static boolean sortedAndRotated(int nums[]){
        int n = nums.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i+1)%n]){  //if (i+1) % 2 need to compare last ele and first ele [2,1,3,4] false since 4 > 2
                k++;
            }
        }
        if (k > 1) return false;
        return true;
    }
    public static void main(String[] args) {
        int num1[] = {5,1,2,3,4};
        int num2[] = {2,1,3,4};
        int num3[] = {1,2,3};

        System.out.println(sortedAndRotated(num1));
        System.out.println(sortedAndRotated(num2));
        System.out.println(sortedAndRotated(num3));
    }
}
