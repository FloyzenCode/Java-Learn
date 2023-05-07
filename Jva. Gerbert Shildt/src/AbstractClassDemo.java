abstract class fun {
    abstract void HelloWorld();
    abstract int SumAB(int a, int b);
    abstract void Bye();
}

class Gg extends fun {
    void HelloWorld() {
        System.out.println("Hello, world!");
    }
    int SumAB(int a, int b) {
        return a + b;
    }
    void Bye() {
        System.out.println("Bye Bye!");
    }
}

public class AbstractClassDemo {
    static public void main(String[] args) {
        Gg obG = new Gg();

        obG.HelloWorld();
        System.out.println(obG.SumAB(5, 5));
        obG.Bye();
    }
}
