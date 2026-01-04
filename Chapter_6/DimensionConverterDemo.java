import java.util.Scanner;

public class DimensionConverterDemo
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a measurement in inches: ");
        double inches = keyboard.nextDouble();
        double feet = DimensionConverter.convertInchesIntoFeet(inches);
        System.out.println(inches + " inches = " + feet + " feet. ");
        
        System.out.println("Enter a measurement in feet: ");
        feet = keyboard.nextDouble();
        inches = DimensionConverter.convertFeetIntoInches(feet);
        System.out.println(feet + " feet = " + inches + " inches. ");
    }
}
