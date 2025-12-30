import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] arg) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci un numero in virgola mobile: ");
        double x = tastiera.nextDouble();
        double y;
        y = 1.0/x;
        double z;
        z = x*y;
        System.out.println("Ora ti mostro il valore di y, x e il loro prodotto: ");
        System.out.println("x: " + x + " y: " + y + " x*y " + z);        
        

    }
}