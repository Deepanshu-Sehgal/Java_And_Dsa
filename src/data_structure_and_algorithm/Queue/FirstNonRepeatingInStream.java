package data_structure_and_algorithm.Queue;

import java.util.Queue;

public class FirstNonRepeatingInStream {
    public static void main(String[] args) {
        String str = "abcbacdabcdeef";
        System.out.println(firstNonRepeatingCharacter(str));

    }

    public static String firstNonRepeatingCharacter(String str) {
        StringBuilder sb = new StringBuilder();

        int frequency[] = new int[26];
        Queue<Character> q = new java.util.LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            q.offer(c);
            frequency[c-'a']++;


            while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
                q.poll();
            }
            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
        }
        return sb.toString();
    }
}
