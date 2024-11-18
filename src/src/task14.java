import java.util.Arrays;
import java.util.Collections;

public class task14 {
    public static void shuffle(int[][] m) {

        Integer[] indices = new Integer[m.length];
        for (int i = 0; i < m.length; i++) {
            indices[i] = i;
        }
        Collections.shuffle(Arrays.asList(indices));


        int[][] shuffled = new int[m.length][m[0].length];


        for (int i = 0; i < indices.length; i++) {
            shuffled[i] = m[indices[i]];
        }

        for (int i = 0; i < m.length; i++) {
            System.arraycopy(shuffled[i], 0, m[i], 0, m[i].length);
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Original matrix:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }

        shuffle(m);

        System.out.println("\nShuffled matrix:");
        for (int[] row : m) {
            System.out.println(Arrays.toString(row));
        }
    }
}