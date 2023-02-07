package java_programming_language.Strings;

import java.util.Scanner;

public class Input_Output_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        //name = sc.next(); //only single word
        name = sc.nextLine(); //full line or multiple words with spaces
        System.out.println(name);
    }
}
