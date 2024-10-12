import java.util.Scanner;

public class Lask2Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double integer = sc.nextDouble();
        double tax = 0.06;
        double re = integer*tax;
        System.out.println(String.format("%.2f",re));


    }
}
