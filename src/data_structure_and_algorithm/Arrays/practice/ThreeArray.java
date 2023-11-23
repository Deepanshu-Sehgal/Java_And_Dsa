package data_structure_and_algorithm.Arrays.practice;

public class ThreeArray {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        int a = profit(price, 2, 3);
        System.out.println("You earned " + a + " rupee profit");
    }

    public static int profit(int[] price, int sell, int buy) {
        int earnedProfit = 0;
        for (int i = 0; i < price.length; i++) {
            earnedProfit = price[buy] - price[sell];
            if (earnedProfit <= 0) {
                return 0;
            }
        }
        return earnedProfit;
    }
}
