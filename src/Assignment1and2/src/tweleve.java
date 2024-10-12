public class tweleve {

        public static void main(String[] args) {

            double distanceMiles = 24;
            int hours = 1;
            int minutes = 40;
            int seconds = 35;

            double distanceKm = distanceMiles * 1.6;
            double totalSeconds = hours * 3600 + minutes * 60 + seconds;
            double totalHours = totalSeconds / 3600.0;
            double averageSpeed = distanceKm / totalHours;
            System.out.printf("平均速度是: %.2f 千米/小时%n", averageSpeed);
        }
    }


