package data_structure_and_algorithm.Recursion;

//company goldman sachs

/*
Question - Given n friends each one can remain single or can be paired up
with some other friends each friend can be paired only once.
find out the total number of ways in with friends can remain
single or can be paired up
*/
public class Friends_paring_problem {
    public static void main(String[] args) {
        System.out.println(Pairing(3));
    }

    public static int Pairing(int n) {
        if (n == 1 || n == 2)
            return n;

        int single = Pairing(n - 1);

        int pairing = (n - 1) * Pairing(n - 2);
        return single + pairing;
    }
}
