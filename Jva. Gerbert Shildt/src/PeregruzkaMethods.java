class Demo {
    int test(int a, int b) {
        return a+b;
    }
    int test(String str, int g) {
        System.out.println(str + ' ' + g);
        return 0;
    }
    int test(double pi) {
        System.out.print(pi);
        return 0;
    }
}

public class PeregruzkaMethods {
    public static void main(String[] args) {
        int a = 5, b = 10;
        String str = "Hello, Java!";
        int g = 5+5;
        double pi = 3.14;
        Demo demo_test = new Demo();
        System.out.println("\n\nint test(int a, int b): ");
        System.out.print(demo_test.test(a, b) + "\n");
        System.out.println("int test(String str, int g): ");
        System.out.print(demo_test.test(str, g) + '\n');
        System.out.println("\nint test(double pi): ");
        System.out.print(demo_test.test(pi) + '\n');
        System.out.println("\nПерегрузка методов работаем примерно такими образом! :)");
    }
}
