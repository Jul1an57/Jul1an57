

import java.util.Scanner;

public class week5task19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int count = input.nextInt();

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();

        System.out.printf("Count: %,d\n", count);
        System.out.printf("Amount: $%,.2f\n", amount);

        input.close();
    }
}

