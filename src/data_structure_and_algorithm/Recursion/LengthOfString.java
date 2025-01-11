package data_structure_and_algorithm.Recursion;

public class LengthOfString {
    public static void main(String[] args) {
        String str = "Deepanshu";
        System.out.println(lengthString(str));
    }

    private static int lengthString(String str) {
        if (str.length() == 0)
            return 0;

        return lengthString(str.substring(1)) + 1;
    }
}
