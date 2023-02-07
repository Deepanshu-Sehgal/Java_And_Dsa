package java_programming_language.Strings;

public class CharAt_String {
    public static void printLetters(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String str = "Deepanshu";
        System.out.println(str.charAt(4));
        printLetters(str);
    }


}
