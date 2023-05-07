//class Box {
//    private double height;
//    private double width;
//    private double depth;
//    // Конструктор, приименяемый, если значения вообще не указаны
//    Box() {
//        width = -1;
//        height = -1;
//        depth = -1;
//    }
//    // Конструктор , применяемый для клонирования объекта
//    Box(Box ob) { // Передать объект конструктору
//        width = ob.width;
//        height = ob.height;
//        depth = ob.depth;
//    }
//    // Конструктор, используемый в случае указаний всех параметров
//    Box(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }
//    // конструктор, в случае создания кубической коробки
//    Box(double len) {
//        width = depth = height = len;
//    }
//
//    // Вычислить и возвратить объём
//    double volume() {
//        return width * height * depth;
//    }
//}
//
//// Добавить вес
//class BoxWeight extends Box {
//    double weight;
//
//    BoxWeight(BoxWeight ob) {
//        super(ob); // Вызвать конструктор суперкласса
//        weight = ob.weight;
//    }
//
//    BoxWeight(double w, double h, double d, double m) {
//        super(w, h, d); // Вызвать конструктор суперкласса
//        weight = m;
//    }
//
//    BoxWeight() {
//        super();
//        weight = -1;
//    }
//
//    BoxWeight(double len, double m) {
//        super(len); // Вызвать конструктор суперкласса
//        weight = m;
//    }
//}
//
//// Добавить стоимость доставки
//class Shipment extends BoxWeight {
//    double cost;
//
//    Shipment(Shipment ob) {
//        super(ob);
//        cost = ob.cost;
//    }
//
//    Shipment(double w, double h, double d, double m, double c) {
//        super(w, h, d, m);
//        cost = c;
//    }
//
//    Shipment() {
//        super();
//        cost = -1;
//    }
//
//    Shipment(double len, double m, double c) {
//        super(len, m);
//        cost = c;
//    }
//}
//
//public class DemoShipment {
//    public static void main(String[] args) {
//        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.14);
//        Shipment shipment2 = new Shipment(2, 3, 4, 0.78, 4.33);
//        double vol = shipment1.volume();
//
//        System.out.println("\nShipment1 = " + vol) ;
//        System.out.println("Вес shipment1 = " + shipment1.weight);
//        System.out.println("Стоимость доставки: $" + shipment1.cost);
//
//        vol = shipment2.volume();
//
//        System.out.println("Shipment2 = " + vol) ;
//        System.out.println("Вес shipment2 = " + shipment2.weight);
//        System.out.println("Стоимость доставки: $" + shipment2.cost);
//    }
//}