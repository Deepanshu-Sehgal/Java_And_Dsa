package data_structure_and_algorithm.Recursion;

/*
company amazon
*/
public class TillingProblem {
    public static void main(String[] args) {

        System.out.println(totalTiles(5));

    }

    public static int totalTiles(int n) { // 2 x n (floor size)

        if (n==0 || n==1)
            return 1;

        //kaam
        //vertical choice
        int verticalTiles = totalTiles(n-1);  //function n - 1

        //horizontal choice
        int horizontalTiles = totalTiles(n-2); //function n - 2

        return verticalTiles + horizontalTiles;

    }
}
