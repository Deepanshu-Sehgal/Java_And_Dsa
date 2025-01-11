package java_programming_language.conditional_statements.if_else_if_;

public class condition_if_else_if {
    public static void main(String[] args) {
        int age = 13;
        if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}
