package java_programming_language.functions_and_methods.function_overloading;

public class Binary_to_Decimal {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = (decNum + (lastDigit * (int) Math.pow(2, pow)));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(111);
    }
}
