package data_structure_and_algorithm.Recursion;

public class SUm_of_natural_num {
    public static void main(String[] args) {
        System.out.println(calSum(5));

    }
    public static int calSum(int n){

        if (n==1){
            return 1;
        }
        int snm1 = calSum(n-1);
        int Sn = n + snm1;
        return Sn;
    }
}
