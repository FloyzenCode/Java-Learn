// Определить интерфейс для целочисленного стека
interface IntStack {
    int push(int item);
    int pop();
}

// Реализация IntStack, использующая хранилище фиксируемой длины
class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    // Разместить в памяти и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек
    public int push(int item) {
        if(tos== stck.length-1)
            System.out.println("Стек полон.");
        else
            stck[++tos] = item;
        return 0;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Стек опустошен.");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // Поместить несколько чисел в стеки
        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 8; i++) mystack2.push(i);

        System.out.println("\nmystack2: ");
        // Извлечь эти числа из стеков
        for(int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("\nmystack2: ");
        for(int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}