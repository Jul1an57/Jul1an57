import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightPounds = sc.nextDouble();
        System.out.println();
        double heightlnches = sc.nextDouble();
        double weightKilograms = weightPounds*0.45359237;
        double heightMeters = heightlnches*0.0254;
        double bmi = weightKilograms/(heightMeters*heightMeters);
        System.out.println("BMI is"+bmi);
    }
}
