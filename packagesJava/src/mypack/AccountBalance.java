package mypack;

class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {

            System.out.print("-->");
            System.out.println(name + ": $" + bal);

    }
}