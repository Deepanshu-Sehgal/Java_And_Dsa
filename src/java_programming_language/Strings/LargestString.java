package java_programming_language.Strings;

public class LargestString {
    public static void main(String[] args) {  //Lexico largest String
        String[] fruits = {"apple", "mango", "banana"};
        String largest = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
