import java.util.Scanner;

public class Media {
    public static void main(String[] arg) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci tre numeri distanziati da uno spazio ciascuno almeno");
        Double x = tastiera.nextDouble();
        Double y = tastiera.nextDouble();
        Double z = tastiera.nextDouble();

        Double media = (x + y + z)/3;

        System.out.println("La media dei tre numeri e': " +  media);
    }

}