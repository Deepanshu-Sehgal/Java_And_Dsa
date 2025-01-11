package data_structure_and_algorithm.Recursion;

public class CountOccOfString {
    public static void main(String[] args) {
        String s = "ababbabacaba";
        String t = "aba";
        System.out.println(countOccurrence(t, s));

    }

    static int countOccurrence(String target, String givenString) {
        return helperCountOccurrence(target, givenString, 0);
    }

    static int helperCountOccurrence(String target, String givenString, int i) {
        if (i > givenString.length() - target.length()) {
            return 0;
        }
        int subProblemKaAns = helperCountOccurrence(target, givenString, i + 1);
        boolean doStartingCharMatch = givenString.startsWith(target, i);
        if (doStartingCharMatch) return subProblemKaAns + 1;
        else return subProblemKaAns;
    }
}
