package java_programming_language.loops_flow_statements.Break_stmt;

public class Continue_stmt {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
    }
}
