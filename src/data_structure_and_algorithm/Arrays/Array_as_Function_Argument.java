package data_structure_and_algorithm.Arrays;

public class Array_as_Function_Argument {
    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
            System.out.println(marks[i]);
        }
    }

    public static void main(String[] args) {
        int[] marks = {34, 56, 23};
        update(marks);
    }
}
