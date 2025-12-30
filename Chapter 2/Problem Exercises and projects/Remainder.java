import java.util.Scanner;

public class Remainder {
    public static void main(String[] arg) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un double: ");
        double x = tastiera.nextDouble();
        double y = x%2;
        System.out.println("x: " + x + " y: " + y);
        int z = (int)x;
        double w = z%2;
        System.out.println("x: " + x + " z: " + z + " z%2: " +w);

    }
}