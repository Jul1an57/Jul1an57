import java.util.Scanner;

public class Lab6Task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        double increaseRate = 0.07;
        int years = 0;

        while (tuition < 2 * 10000) {
            tuition += tuition * increaseRate;
            years++;
        }

        System.out.println("Tuition will be doubled in " + years + " years");
        System.out.printf("Tuition will be $%.2f in %d years", tuition, years);
    }
}