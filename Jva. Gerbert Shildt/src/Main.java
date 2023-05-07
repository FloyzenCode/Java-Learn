import java.util.Scanner;
import java.lang.String;

public class Main {
    public static int eq(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int a, b;
        String op;
        Scanner scan = new Scanner(System.in);
        System.out.println("1: ");
        a = scan.nextInt();
        System.out.println("2: ");
        op = scan.next();
        System.out.println("3: ");
        b = scan.nextInt();

        if(op.equals('+')) {
            System.out.print((a+b));
        }
        if(op.equals('-')) {
            System.out.print((a - b));
        }
        if(op.equals('/')) {
            System.out.print((a / b));
        }
        if(op.equals('*')) {
            System.out.print((a * b));
        }
        if(op.equals('^')) {
            System.out.print(eq(a, b));
        }
   }
}
