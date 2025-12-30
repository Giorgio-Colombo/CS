import java.util.Scanner;

public class WhileDemo 
{
    public static void main(String[] arg)
    {
        int count, number;

        System.out.println("Enter a number: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        count = 1;
        while (count <= number)
        {
            System.out.println(count + " ");
            count++;
        }
        System.out.println();
        System.out.println("Buckle my shoe");

    }

}