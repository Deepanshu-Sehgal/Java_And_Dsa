package Object_oriented_programming;

public class Access_modifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Deepanshu Sehgal";
        //myAcc.password  not accessible giving error coz it is private or not visible
        myAcc.setPassword("kkdfjhkjdfh"); //but we can set password or access password
        // through public function to change it
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }

}
