public class tweleve {


        public static void main(String[] args) {

            double distanceInMiles = 24;
            int hours = 1;
            int minutes = 40;
            int seconds = 35;


            double distanceInKilometers = distanceInMiles * 1.6;


            double totalHours = hours + (minutes / 60.0) + (seconds / 3600.0);


            double averageSpeed = distanceInKilometers / totalHours;


            System.out.printf("平均速度为: %.2f 公里/小时%n", averageSpeed);
        }
    }

