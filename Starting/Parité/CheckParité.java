import java.util.Scanner;
import java.util.InputMismatchException;

public class CheckParité {
    public static void main (String[] av) {
        Scanner scann = new Scanner(System.in);
        int number = 0;

        try {
            System.out.println("Entrer votre nombre");
            number = scann.nextInt();
            if (number % 2 == 0)
                System.out.println("Votre nombre est pair.");
            else
                System.out.println("Votre nombre est pair.");

        } catch (InputMismatchException e) {
            System.err.println("Invalid argument type.");
        }
        scann.close();
    }    
}
