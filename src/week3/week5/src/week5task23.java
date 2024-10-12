
import java.util.Scanner;

public class week5task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center of the pentagon to a vertex (circumradius): ");
        double r = input.nextDouble();

        double area = (5.0 / 2.0) * r * r * Math.tan(Math.PI / 5);

        System.out.printf("The area of the pentagon is: %.2f\n", area);

        input.close();
    }
}
