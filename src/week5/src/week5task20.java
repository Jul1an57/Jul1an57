
import java.util.Scanner;

public class week5task20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 15: ");
        int number = input.nextInt();

        if (number < 0 || number > 15) {
            System.out.println("Invalid input. Please enter a number between 0 and 15.");
        } else {

            String hex = Integer.toHexString(number).toUpperCase();

            System.out.printf("The hexadecimal representation is: %-10s\n", hex);
        }

        input.close();
    }
}


