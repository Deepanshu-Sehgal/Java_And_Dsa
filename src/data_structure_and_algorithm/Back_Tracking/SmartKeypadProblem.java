package data_structure_and_algorithm.Back_Tracking;

import java.util.ArrayList;

public class SmartKeypadProblem {
    public static void main(String[] args) {
        String input = "53";
        System.out.println(smartKeypad(input));
    }

    static ArrayList<String> smartKeypad(String input) {
        String[] map = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        ArrayList<String> ans = new ArrayList<>();
        smartKeypadHandler(input, map, 0, ans, "");
        return ans;

    }

    static void smartKeypadHandler(String input, String[] map, int index, ArrayList<String> ans, String cur) {
        if (index == input.length()) {
            ans.add(cur);
            return;
        }

        int keypadNumber = input.charAt(index) - '0';
        String keypadString = map[keypadNumber];

        for (int i = 0; i < keypadString.length(); i++) {
            cur = cur + keypadString.charAt(i);
            smartKeypadHandler(input, map, index + 1, ans, cur);
            cur = cur.substring(0, cur.length() - 1); //Back tracking
        }
    }
}
