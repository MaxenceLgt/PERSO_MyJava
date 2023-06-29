import java.util.Scanner;
import java.util.InputMismatchException;


public class IsPalindrome {
    public static void main (String[] av) {
        Scanner scann = new Scanner(System.in);
        String word = "";
        String reverse = "";

        try {
            System.out.println("Entrez un mot pour vérifier si il est palindrome.");
            word = scann.nextLine();

            for (int i = word.length() - 1; i >= 0; i--)
                reverse += word.charAt(i);
            for (int i = 0; i < word.length(); i++)
                if (word.charAt(i) != reverse.charAt(i)) {
                    System.out.println("Ce mot n'est pas un palindrome.");
                    scann.close();
                    System.exit(0);
                }
            System.out.println("Ce mot est un palindrome.");
            scann.close();
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid argument.");
        }
    }
}
