

import java.util.Scanner;

public class week5task22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for an integer between 0 and 15
        System.out.print("Enter an integer between 0 and 15: ");
        int number = input.nextInt();

        // Check for valid input
        if (number < 0 || number > 15) {
            System.out.println("Invalid input. Please enter a number between 0 and 15.");
        } else {
            // Convert to hexadecimal
            String hex = Integer.toHexString(number).toUpperCase();
            System.out.println("The hexadecimal representation is: " + hex);
        }

        input.close();
    }
}
