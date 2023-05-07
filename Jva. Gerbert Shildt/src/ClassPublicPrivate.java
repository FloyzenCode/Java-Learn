class Test {
    public int a = 10;
    private int b = 20;

    int printIntB() {
        return b;
    }
}

public class ClassPublicPrivate {
    public  static void main(String[] args) {
        Test Q = new Test();
        System.out.println("Модификаторы доступа класса public и private.\n");
        System.out.println("Q.a = " + Q.a);
        System.out.println("\nQ.b не доступен\nМожно вывести b через функцию созданную в классе Test:");
        System.out.println(Q.printIntB());
        // System.out.println(Q.b); -> Ошибка, т.к. int b имеет модификатор доступа private. (int b можно использовать только внутри класса)
    }
}
