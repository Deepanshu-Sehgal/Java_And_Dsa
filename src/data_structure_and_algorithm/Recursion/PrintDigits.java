package data_structure_and_algorithm.Recursion;

public class PrintDigits {
    static String digits[] = {"one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[] args) {
        printDigits(1972);

    }

    public static void printDigits(int number){
        if (number == 0 )
            return;

        int lastDigit = number%10;
        printDigits(number/10);
        System.out.println(digits[lastDigit -1 ]+" ");

    }
}
