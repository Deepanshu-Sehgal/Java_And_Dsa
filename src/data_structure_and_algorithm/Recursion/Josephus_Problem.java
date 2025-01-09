package data_structure_and_algorithm.Recursion;

public class Josephus_Problem {

    //Goli marne vli game hai ye ki 5 log hai and hr 3re bande ko gun se marna hai
    public static void main(String[] args) {
        System.out.println(josephus(6,4));
    }

    static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }
}
