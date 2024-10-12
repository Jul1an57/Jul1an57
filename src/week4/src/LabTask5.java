import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subtotal = sc.nextInt();
        int gratuityrate = sc.nextInt();
        double rate = (double) gratuityrate /100;
        double gratuity = subtotal * rate;
        double total = gratuity+subtotal;
        System.out.println("The gratuity is"+gratuity+"and total is"+total);
    }
}
