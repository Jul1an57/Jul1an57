import java.util.Scanner;

public class Lab2Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (two digits): ");
        int number = scanner.nextInt();
        if (number < 0 || number > 99) {
            System.out.println("Please enter a valid number between 0 and 99.");
            return;
        }
        String formattedNumber = String.format("%02d", number);

        String old_number ="33";
        System.out.println("The lottery pick number is :"+old_number);
        if(formattedNumber==old_number){
            System.out.println("Match all digits:you win $3000");
        }
        scanner.close();
    }

}
