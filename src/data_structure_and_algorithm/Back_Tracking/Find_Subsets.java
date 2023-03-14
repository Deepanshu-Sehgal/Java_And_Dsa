package data_structure_and_algorithm.Back_Tracking;


// time complexity = O(2^n * n) and space complexity = O(n)
public class Find_Subsets {

    public static void findSubsets(String str, String ans,int i){
        //base case
        if (i==str.length()){
            System.out.println(ans);
            return;
        }

        //recursion
        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);

        //no choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,"",0);


    }

}
