import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];


        try {
            File file = new File("C:\\Users\\lenovo\\Desktop\\Weather.txt");
            Scanner input = new Scanner(file);

            int recordCount = 0;
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] values = line.split(" ");
                int day = Integer.parseInt(values[0]);
                int hour = Integer.parseInt(values[1]);
                double temperature = Double.parseDouble(values[2]);
                double humidity = Double.parseDouble(values[3]);

                data[day - 1][hour - 1][0] = temperature;
                data[day - 1][hour - 1][1] = humidity;
                recordCount++;
            }
            input.close();


            if (recordCount != NUMBER_OF_DAYS * NUMBER_OF_HOURS) {
                System.out.println("Error: Expected " + NUMBER_OF_DAYS * NUMBER_OF_HOURS + " records, but read " + recordCount);
                return;
            }


            for (int i = 0; i < NUMBER_OF_DAYS; i++) {
                double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
                for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                    dailyTemperatureTotal += data[i][j][0];
                    dailyHumidityTotal += data[i][j][1];
                }

                System.out.println("Day " + (i + 1) + "'s average temperature is " + (dailyTemperatureTotal / NUMBER_OF_HOURS));
                System.out.println("Day " + (i + 1) + "'s average humidity is " + (dailyHumidityTotal / NUMBER_OF_HOURS));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
