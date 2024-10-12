import javax.script.ScriptContext;
import java.util.Scanner;

public class Lab2Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monthlySaving = sc.nextDouble();
        double monthlyInterestRate = 0.00417;
        double accountValue = 0;
        for (int i = 1; i <=6 ; i++) {
            accountValue =(accountValue+monthlySaving)*(1+monthlyInterestRate);
        }
        System.out.println(accountValue);
    }
}
