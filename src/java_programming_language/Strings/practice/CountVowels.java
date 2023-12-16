package java_programming_language.Strings.practice;

public class CountVowels {
    public static void main(String[] args) {
        String a = "Deepanshu";

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        System.out.println(count);
    }
}
