package data_structure_and_algorithm.Arrays;

public class Print_Sub_Arrays {
    public static void subArray(int[] number) {
        for (int start = 0; start < number.length; start++) { //for finding Start index
            for (int end = start; end < number.length; end++) { //for finding end index
                for (int k = start; k <= end; k++) { //for printing sub Array's
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 4, 5, 6};
        subArray(num);
    }

}
