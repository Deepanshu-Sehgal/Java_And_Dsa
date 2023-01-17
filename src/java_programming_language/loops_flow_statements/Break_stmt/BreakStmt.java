package java_programming_language.loops_flow_statements.Break_stmt;

public class BreakStmt {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==5)
                break;
            System.out.println(i);
        }
    }
}
