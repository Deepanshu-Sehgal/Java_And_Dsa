package java_programming_language.Strings;

public class Substring {

    public static String subStrings(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String s1 = "Deepanshu";
        System.out.println(subStrings(s1,2,6));
        System.out.println(s1.substring(2, 6)); // ans = epan
    }
}
