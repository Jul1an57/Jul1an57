public class eleven {

        public static void main(String[] args) {

            long currentPopulation = 312032486L;


            long secondsPerYear = 365L * 24 * 60 * 60;


            long birthsPerSecond = 1;
            long deathsPerSecond = 1 / 13;
            long immigrantsPerSecond = 1 / 45;


            double birthsPerYear = birthsPerSecond * secondsPerYear;
            double deathsPerYear = deathsPerSecond * secondsPerYear;
            double immigrantsPerYear = immigrantsPerSecond * secondsPerYear;


            for (int year = 1; year <= 5; year++) {

                double netGrowth = birthsPerYear - deathsPerYear + immigrantsPerYear;


                currentPopulation += netGrowth;


                System.out.println("Year " + year + ": " + currentPopulation);
            }
        }
    }

