public class ten {

    public static void main(String[] args) {

        double distanceInKm = 14;
        double distanceInMiles = distanceInKm / 1.6;
        int minutes = 45;
        int seconds = 30;
        double totalHours = minutes / 60.0 + seconds / 3600.0;
        double averageSpeed = distanceInMiles / totalHours;
        System.out.printf("The average speed is: %.2f miles per hour%n", averageSpeed);
    }
}

