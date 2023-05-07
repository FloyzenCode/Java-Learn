import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        String operation;
        System.out.println("a: ");
        a = scan.nextInt(); // scan a
        System.out.println("operation: ");
        operation = scan.next(); // scan operation
        System.out.println("b: ");
        b = scan.nextInt(); // scan b

        int answer = 0; // answer

        switch (operation) { // switch operation -> answer
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            case "/":
                answer = a / b;
                break;
            case "^":
                answer = a^b;
                break;
            default:
                System.out.println("ERROR"); // if input not correct operation
        }

        System.out.println(answer); // return answer
    }
}