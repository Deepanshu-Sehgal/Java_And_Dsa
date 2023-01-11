package java_programming_language.variable_and_datatypes;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pencil price");
        int $ = sc.nextInt();
        System.out.println("Pen price");
        int pen = sc.nextInt();
        System.out.println("Eraser price");
        int eraser = sc.nextInt();

        int totalAmt = pen + $ + eraser;
        int gst = (totalAmt * 18 )/ 100;
        System.out.println("Item total Amount = " + totalAmt);
        System.out.println("GST 18 % = "+gst);
        System.out.println("Total = "+ (totalAmt + gst));
    }
}
