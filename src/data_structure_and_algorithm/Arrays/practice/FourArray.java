package data_structure_and_algorithm.Arrays.practice;

public class FourArray {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println(trappedRainWater(height));
    }

    static int trappedRainWater(int[] height) {

        int n = height.length;

        //calculate left max boundary - array
        int[] leftMax = new int[height.length];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        for (int max : leftMax) {
            System.out.print(max + " ");
        }
        System.out.println();

        //calculate right max boundary - array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        for (int i = 0; i < leftMax.length; i++) {
            System.out.print(rightMax[i] + " ");
        }
        System.out.println();

        int trappedWater = 0;
        //loop
        for (int i = 0; i < n; i++) {
            //waterLevel = min(leftmax bound,rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
