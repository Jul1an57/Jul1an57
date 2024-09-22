public class therteen {

        public static void main(String[] args) {

            double a = 3.4;
            double b = 50.2;
            double c = 2.1;
            double d = 0.55;
            double e = 44.5;
            double f = 5.9;


            double det = a * d - b * c;

            if (det == 0) {
                System.out.println("The system does not have a unique solution.");
                return;
            }


            double detX = e * d - f * b;

            double detY = a * f - e * c;


            double x = detX / det;
            double y = detY / det;


            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }

