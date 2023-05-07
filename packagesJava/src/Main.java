import mypack.*;


public class Main {
    public static void main(String[] args) {
        Balance[] current = new Balance[3];

        current[0] = new Balance("K.J. Fielding", 123.23);
        current[1] = new Balance("Floyzen", 1234.241);
        current[2] = new Balance("LOL", -12.234);

        for(int i = 0; i <3; i++) current[i].show();
    }
}
