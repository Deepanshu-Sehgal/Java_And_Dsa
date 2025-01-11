package java_programming_language.Strings;

public class Compare {
    public static void main(String[] args) {
        String s1 = "Deep";
        String s2 = "Deep";
        String s3 = "Deep";

        if (s1 == s2)
            System.out.println("String is same");
        else System.out.println("String is not same");

        if (s1 == s3)
            System.out.println("String is same");
        else System.out.println("String is not same");

        //for comparing new string class value with simple string value
        if (s1.equals(s3))
            System.out.println("String is same");
        else System.out.println("String is not same");
    }
}
