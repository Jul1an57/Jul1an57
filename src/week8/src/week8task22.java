import java.util.Scanner;

public class week8task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        double array[] =new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
        double min = findmin(array);
    }

    private static double findmin(double[] array) {
        double min = array[0];
        for (double v : array) {
            if(v<min){
                min = v;
            }
        }
        return min;
    }

}
