//// Просто пример наследования классов
//// Создать суперкласс
//class A {
//    A(){
//        super();
//    }
//    int i, j;
//
//    void showij() {
//        System.out.println("i и j: " + i + " " + j);
//    }
//}
//// Создать подкласс путём расширения класса А
//class B extends A {
//    int k;
//
//    void showk() {
//        System.out.println("k: " + k);
//    }
//    void sum() {
//        System.out.println("i + j + k = " + (i + j + k));
//    }
//}
//
//public class SimpleInheritance {
//    public static void main(String[] args) {
//        A superObject = new A();
//        Gg subOb = new Gg();
//        superObject.i = 10;
//        superObject.j = 20 + subOb.i; // 20 + 10
//        System.out.println("Содержимое superObject: ");
//        superObject.showij();
//
//        // Подкласс имеет доступ ко всем своим переменным своего суперкласса
//        subOb.i = 5;
//        subOb.j = 10;
//        subOb.k = 15;
//        System.out.println("\nСодержимое subOb: ");
//        subOb.showij();
//        subOb.showk();
//        System.out.println("\nСумма i+j+k: ");
//        subOb.sum();
//    }
//}
