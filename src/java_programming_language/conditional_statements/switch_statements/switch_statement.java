package java_programming_language.conditional_statements.switch_statements;

public class switch_statement {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Mango shake");
                break;
            default:
                System.out.println("we realize we are dreaming");
        }
    }
}
