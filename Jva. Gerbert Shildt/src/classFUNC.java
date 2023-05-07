class ffunnct {
    public
    int square(int i) {
        return i * i;
    }
}

public class classFUNC {
    public static void main(String[] args) {
        ffunnct fc = new ffunnct();
        int resClass = fc.square(5);
        System.out.println(resClass);
    }
}
