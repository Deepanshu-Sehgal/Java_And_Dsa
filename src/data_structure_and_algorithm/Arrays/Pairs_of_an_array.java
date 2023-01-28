package data_structure_and_algorithm.Arrays;

/*

Important question for interview
How to find pairs of array
            and
how many pairs are present in array
Time complexity is O(n raise to power 2)
*/
public class Pairs_of_an_array {
    public static void pairs(int[] num){
        int totalPairs = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+num[i]+","+num[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs in array are : "+totalPairs); //Important for interviews
    }
    public static void main(String[] args) {
        int[] num = {2,3,4,5,8,10};
        pairs(num);
    }
}


