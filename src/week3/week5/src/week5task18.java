
public class week5task18 {
    public static void main(String[] args) {
        double amount = 1000.00;
        double interestRate = 0.05;
        double interest = amount * interestRate;

        System.out.println("Interest with two decimal point is $" + String.format("%.2f", interest));
    }
}
