import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner oper = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int num3 = num1.nextInt();
        System.out.println("Введите значение: ");
        int num4 = num2.nextInt();
        System.out.println("Оператор: ");
        char operator = oper.next().charAt(0);
        int res = 0;
        switch (operator) {
            case '+':
                res = num3 + num4;
                break;
            case '-':
                res = num3 - num4;
                break;
            case '/':
                res = num3 / num4;
                break;
            case '*':
                res = num3 * num4;
                break;
            default:
                System.out.println("ERROR");
        }
        System.out.print("" + res);
    }
}