import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateSomme {
    public static void main (String[] av) {
        Scanner scann = new Scanner(System.in);
        int nb1 = 0, nb2 = 0, result = 0;

        try {
        System.out.println("Choisissez le premier nombre");
        nb1 = scann.nextInt();
        System.out.println("Choisissez le deuxième nombre");
        nb2 = scann.nextInt();
        result = nb1 + nb2;
        System.out.println("Résultat Somme: " + result);
        } catch (InputMismatchException e) {
            System.err.println("Invalid argument type.");
        }
        scann.close();
    }
}
