import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculeMoyenne {
    public static void main (String[] av) {
        float result = 0;
        int counter = 0;
        Scanner scann = new Scanner(System.in);

        try {
            System.out.println("Entrez le nombre d'éléments dans la moyenne.");
            counter = scann.nextInt();
            for (int i = 0, display = 1; i < counter; i++, display++) {
                System.out.println("Saisissez le nombre " + display);
                result += scann.nextFloat();
            }
            result /= counter;
            System.out.println("Voici la moyenne : " + result);
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid arguments type");
        }
        scann.close();
    }
}
