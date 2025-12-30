import java.util.Scanner;

public class CestiniUova {
  
    public static void main(String arg[]){
        int numeroDiCestini, uovaPerCestino, totaleUova;

        //numeroDiCestini = 10;
        //uovaPerCestino = 6;
        
        try (Scanner tastiera = new Scanner(System.in)) {
            System.out.println("Inserisci il numero di uova per ciascun cestino: ");
            uovaPerCestino = tastiera.nextInt();
            System.out.println("Inserisci il numero di cestini: ");
            numeroDiCestini = tastiera.nextInt();
            totaleUova  = numeroDiCestini * uovaPerCestino;
            
            System.out.println("Se hai");
            System.out.println(uovaPerCestino + " uova per cestino e");
            System.out.println(numeroDiCestini + " cestini");
            System.out.println("il numero totale di uova è " + totaleUova);
        }
    }
}