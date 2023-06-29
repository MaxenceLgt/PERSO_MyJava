import java.util.Scanner;
import java.util.InputMismatchException;

public class CelsiusToFahrenheit {
    public static void main (String[] av) {
        Scanner scann = new Scanner(System.in);
        float Celsius = 0;
        float Fahrenheit = 0;

        try {
            System.out.print("Entrez une valeur en Celsius : ");
            Celsius = scann.nextFloat();
            Fahrenheit = Celsius * 9 / 5 + 32;
            System.out.println("Sa conversion en Fahrenheit est la suivante : " + Fahrenheit);
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid parameters type.");
        }
        scann.close();
    }
}
