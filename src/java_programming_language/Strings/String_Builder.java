package java_programming_language.Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Deep");
        for (int ch = 'a'; ch < 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
