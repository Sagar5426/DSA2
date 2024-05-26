import java.util.ArrayList;

public class pairSum_2 {
    public static int breakingPoint(ArrayList<Integer> list){
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) > list.get(i+1)){
                return i;
            }
        }
        return -1;
    }
    public static boolean pairSum2(ArrayList<Integer> list, int target){

        int bp = breakingPoint(list);
        int lp = bp+1; // smallest element
        int rp = bp;

        int n = list.size();

        while (lp != rp){
            int currSum = list.get(lp) + list.get(rp);
            //case 1
            if(currSum == target){
                System.out.println(list.get(lp)+" and "+ list.get(rp)+" has sum equal to target: "+ target);
                return true;
            }
            //case 2
            if (currSum < target) {
                lp = (lp+1) % n;
            }else{
                // case 3
                rp = (rp-1+n) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10 - Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(pairSum2(list,target));

    }
}
