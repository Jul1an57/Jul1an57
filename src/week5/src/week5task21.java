


public class week5task21 {
    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-15s", "Degrees", "Radians", "Tangent");

        for (int degrees = 0; degrees <= 90; degrees += 10) {
            System.out.printf("%-15d %-15.4f %-15.4f", degrees, Math.toRadians(degrees), Math.tan(Math.toRadians(degrees)));
        }
    }
}

