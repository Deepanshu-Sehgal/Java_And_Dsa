package java_programming_language.Patterns;

public class Nested_Loop_Star_Patterns {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) { //shows one line
            for (int star = 1; star <= line; star++) {//shows stars according to line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
