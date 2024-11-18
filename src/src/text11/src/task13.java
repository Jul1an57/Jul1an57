import java.util.Random;

public class task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[4][4];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        int maxRow = 0, maxCol = 0, maxCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }

        maxCount = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxCol = j;
            }
        }

        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxCol);
    }
}