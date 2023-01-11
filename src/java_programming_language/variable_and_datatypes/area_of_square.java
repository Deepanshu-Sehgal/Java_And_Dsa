package java_programming_language.variable_and_datatypes;

import java.util.Scanner;

public class area_of_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square");
        int side = sc.nextInt();
        int ans = side * side;
        System.out.println(ans);
    }
}
