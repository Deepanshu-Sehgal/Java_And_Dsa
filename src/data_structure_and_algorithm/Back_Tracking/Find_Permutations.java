package data_structure_and_algorithm.Back_Tracking;

//tc = O(n+n!)
public class Find_Permutations {
    public static void findPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr,ans+current);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str,"");
    }
}
