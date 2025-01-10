package data_structure_and_algorithm.Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    static boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    static boolean isPalindromeHelper(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) == s.charAt(right)) {
            return isPalindromeHelper(s, left + 1, right - 1);
        }
        return false;

    }
}
