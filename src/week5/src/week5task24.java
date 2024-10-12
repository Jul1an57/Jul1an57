
import java.util.Scanner;

public class week5task24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String userInput = input.nextLine();

        if (userInput.length() != 1) {
            System.out.println("Invalid input. Please enter a single letter.");
        } else {
            char letter = userInput.charAt(0);

            if (Character.isLetter(letter)) {
                if ("AEIOUaeiou".indexOf(letter) != -1) {
                    System.out.println(letter + " is a vowel.");
                } else {
                    System.out.println(letter + " is a consonant.");
                }
            } else {
                System.out.println("Invalid input. Please enter a letter.");
            }
        }

        input.close();
    }
}
