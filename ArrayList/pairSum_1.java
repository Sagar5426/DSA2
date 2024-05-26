import java.util.ArrayList;

public class pairSum_1 {

    public static boolean pairSum(ArrayList<Integer> list, int target){

        int lp = 0;
        int rp = list.size()-1;
        while (lp < rp){
            int currSum = list.get(lp) + list.get(rp);
            if(currSum == target){
                System.out.println(list.get(lp)+" and "+ list.get(rp)+" has sum equal to target: "+ target);
                return true;
            } else if (currSum < target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1, 2, 3, 4, 5, 6 - Sorted in Ascending order
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(pairSum(list,target));
    }
}
