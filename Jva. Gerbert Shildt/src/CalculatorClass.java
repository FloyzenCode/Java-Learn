//import java.util.Scanner;
//
//class Calculate {
//    int a, b;
//    char operation;
//    Calculate(int q, int w, char ch) {
//        a = q;
//        b = w;
//        ch = operation;
//    }
//
//    Calculate() {
//        a = 100;
//        b = 100;
//        operation = '+';
//    }
//
//    int pow(int s, int d) {
//        return s*d;
//    }
//
//    int Calc() {
//        switch (operation) {
//            case '+':
//                System.out.print((a + b));
//                break;
//            case '-':
//                System.out.print((a - b));
//                break;
//            case '*':
//                System.out.print((a * b));
//                break;
//            case '/':
//                System.out.print((a / b));
//                break;
//            case '^':
//                System.out.print(pow(a, b));
//                break;
//            default:
//                System.out.println("ERROR!\n");
//                return 0;
//        }
//        return 0;
//    }
//}
//
//public class CalculatorClass {
//    public static void main(String[] args) {
//        int a, b;
//        char oper;
//        Scanner cin = new Scanner(System.in);
//        System.out.println("Введите a: ");
//        a = cin.nextInt();
//        System.out.println("Введите oper: ");
//        oper = cin.next().charAt(0);
//        System.out.println("Введите b: ");
//        b = cin.nextInt();
//        System.out.println("Succes!\n");
//        Calculate call = new Calculate(a, b, oper);
//
//        call.Calc();
//    }
//}
