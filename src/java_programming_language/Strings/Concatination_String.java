package java_programming_language.Strings;

public class Concatination_String {
    public static void main(String[] args) {
        String name = "Deepanshu";
        String lastName = "Sehgal";
        String fullName = name + " " + lastName;
        System.out.println(fullName);
        System.out.println(name.concat(lastName)); //concatination of two string
    }
}
