package java_programming_language.loops_flow_statements.while_loop;

import java.util.Scanner;

public class Print_one_to_n {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter range");
        int range = s.nextInt();
        int counter = 1;
        while (counter <= range) {
            System.out.println(counter);
            counter++;
        }
    }
}
