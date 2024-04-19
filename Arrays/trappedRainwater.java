public class trappedRainwater {

    public static int trappedRainwater(int[] height){
        int n = height.length;

        if (n <= 2) {
            // If there are less than 3 bars, it's not possible to trap water.
            return 0;
        }
        //calculate left max boundary - array helper
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary - array helper
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            // Water can only be trapped if the current bar's height is less than both left and right boundaries.
            if (height[i] < leftMax[i] && height[i] < rightMax[i]) {
            //waterLevel = min(leftMax bound , rightMax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int height2[] = {4,2};
        int height3[] = {4,4,4,4};


        System.out.println("Total Trapped Water: "+trappedRainwater(height));
        System.out.println("Total Trapped Water: "+trappedRainwater(height2));
        System.out.println("Total Trapped Water: "+trappedRainwater(height3));

    }
}
