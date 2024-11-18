public class task12 {


    public static double sumColumn(double[][] matrix, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {

        double[][] matrix = {
                {1.5, 2.3, 4.0, 5.6},
                {5.5, 6.7, 8.0, 7.8},
                {9.5, 1.3, 1.0, 3.1}
        };


        System.out.print("Enter the column index to sum (0-based): ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int columnIndex = scanner.nextInt();


        if (columnIndex < 0 || columnIndex >= matrix[0].length) {
            System.out.println("Column index is out of bounds.");
        } else {

            double sum = sumColumn(matrix, columnIndex);
            System.out.println("Sum of the elements at column " + columnIndex + " is " + sum);
        }

        scanner.close();
    }
}