package java_programming_language.conditional_statements.if_else_if_;

public class largest_of_three {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 6;
        if (a>=b && a>=c){
            System.out.println("largest is a");
        } else if (b>=c) {
            System.out.println("largest is b");
        } else {
            System.out.println("largest is c");
        }
    }
}
