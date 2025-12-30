import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] arg) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci un numero in virgola mobile: ");
        double x = tastiera.nextDouble();
        int y = (int)x;
        System.out.println("x: " + x + " y: " + y);
        byte z = (byte)x; 
        System.out.println("z: " + z);


    }

}

