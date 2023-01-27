package java_programming_language.Arrays;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        //create array
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        //array input
       /* marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //Array output
        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("maths : " + marks[2]);

        //update array
        marks[2] = 100;
        System.out.println("maths : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage : " + percentage + "%");*/

        //length of an array
        System.out.println("length of an array" + marks.length);


    }
}
