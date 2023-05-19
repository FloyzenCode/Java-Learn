import java.util.*;

class Address {
    private String name = "";
    private String street = "";
    private String city = "";
    private String state = "";
    private String code = "";
    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}

class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');

        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if(k == 0)
            return  aStr.compareToIgnoreCase(bStr);
        else
            return k;
    }
}

public class Main {
    public static void ArrayListDemo() {
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        for(int i = 0; i < 4; i++) {
            a1.add(i);
        }

        System.out.println("Elements array: " + a1);

        Integer[] ia = new Integer[a1.size()];
        ia = a1.toArray(ia);
        int sum = 0;

        for(int i : ia) {
            sum += i;
        }
        System.out.println("Sum elements array: " + sum);
    }

    public static void LinkedListDemo() {
        LinkedList<String> ll = new LinkedList<String>();
        String[] arr = { "A", "B", "C", "D", "E", "F", "G", "W", "Z", "X", "M", "L"};

        ll.add(arr[0 + 2]);
        ll.add(arr[1 + 2]);
        ll.add(arr[2 + 2]);
        ll.add(arr[3 + 2]);
        ll.add(arr[4 + 2]);
        ll.add(arr[5 + 2]);
        ll.add(arr[6 + 2]);
        ll.add(arr[7 + 2]);
        ll.add(arr[8 + 2]);
        ll.add(arr[9 + 2]);

        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "a");

        ll.remove("F");
        ll.remove(2);

        System.out.println("Содержимое LinkedList ll после удаления: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое LinkedList ll после удаления первого и последнего элемента: " + ll);

        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое LinkedList ll после изменения: " + ll);

    }

    public static void HashSetDemo() {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println("HashSet elements: " + hs);
    }

    public static void TreeSetDemo() {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println("TreeSet elements: " + ts);
    }

    public static void ArrayDequeDemo() {
        ArrayDeque<String> adq = new ArrayDeque<String>();

        adq.add("A");
        adq.add("B");
        adq.add("D");
        adq.add("E");
        adq.add("F");

        System.out.println("Извлечение из стека: ");

        while (adq.peek() != null) {
            System.out.println(adq.pop() + " ");
        }

        System.out.println();
    }

    public static void IteratorDemo() {
        ArrayList<String> al = new ArrayList<String>();

        al.add("A");
        al.add("D");
        al.add("F");
        al.add("G");
        al.add("X");
        al.add("Z");
        // use iterator for display elements al
        System.out.println("Elements al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + "+");
        }

        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Modification elements al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + "+");
        }
        System.out.println();
        // display List inverse sort
        System.out.println("Modification list inverse sort: ");
        while (litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // alternative for iterators
    public static void ForEachDemo() {
        ArrayList<Integer> values = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) {
            values.add(i); // 1 2 3 4 5
        }

        System.out.print("Elements values: ");

        for(int v : values) {
            System.out.print(v + " ");
        }

        System.out.println();

        // Sum values
        int sum = 0;
        for(int v : values) {
            sum += v;
        }

        System.out.print("Sum values: " + sum);
    }

    public static void SpliteratorDemo() {
        ArrayList<Double> values = new ArrayList<>();

        values.add(1.0);
        values.add(2.0);
        values.add(3.0);
        values.add(4.0);
        values.add(5.0);

        System.out.print("Elements values:\n");
        Spliterator<Double> splitr = values.spliterator();
        while (splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        splitr = values.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        System.out.print("Elements sqrs: ");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.print(n));
        System.out.println();
    }

    // Хранения объектов в пользовательских коллекциях
    public static void MailListExample() {
        LinkedList<Address> ml = new LinkedList<Address>();

        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));

        for(Address element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }

    public static void HashMapDemo() {
        HashMap<String, Double> hm = new HashMap<String, Double>();

        hm.put("John Doe", 3434.34);
        hm.put("Tom Smith", 123.22);
        hm.put("Carl Johnson", 233.129);
        hm.put("Tod Hall", 99.22);
        hm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("John Doe");
        hm.put("John Doe", balance + 1000);

        System.out.println("New balance client John Doe: " + hm.get("John Doe"));
    }

    public static void TreeMapDemo() {
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        tm.put("Tom Smith", 123.22);
        tm.put("John Doe", 3434.34);
        tm.put("Carl Johnson", 233.129);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Dor");
        tm.put("John Doe", balance + 1000);

        System.out.println("New balance client John Doe: " +
                tm.get("John Doe"));
    }

    // Use comparator for sort balance last name client
    public static void TreeMapDemoComparator() {
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        tm.put("Tom Smith", 123.22);
        tm.put("John Doe", 3434.34);
        tm.put("Carl Johnson", 233.129);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);
        System.out.println("New balance client John Doe: " +
                tm.get("John Doe"));
    }

    public static void main(String[] args) {
        ArrayListDemo();
        LinkedListDemo();
        HashSetDemo();
        TreeSetDemo();
        ArrayDequeDemo();
        IteratorDemo();
        ForEachDemo();
        SpliteratorDemo();
        MailListExample();
        HashMapDemo();
        TreeMapDemo();
        TreeMapDemoComparator();
    }
}