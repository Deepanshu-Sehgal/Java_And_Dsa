package data_structure_and_algorithm.Arrays.Searching;

public class Linear_Search {
    public static int search(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 5, 6, 12, 34, 56, 76, 87, 89, 100};
        int key = 33;

        int index = search(num, key);
        if (index == -1)
            System.out.println("Not found");
        else
            System.out.println("Index is : " + index);
    }
}
