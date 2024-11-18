public class task11 {
    public static void main(String[] args) {

        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 0, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };


        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            for (int j = 0; j < workHours[i].length; j++) {
                totalHours[i] += workHours[i][j];
            }
        }


        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = 0; j < totalHours.length - i - 1; j++) {
                if (totalHours[j] < totalHours[j + 1]) {
                    // 交换总小时数
                    int temp = totalHours[j];
                    totalHours[j] = totalHours[j + 1];
                    totalHours[j + 1] = temp;
                }
            }
        }


        for (int i = 0; i < totalHours.length; i++) {
            System.out.println("Employee " + (i + 1) + " total hours: " + totalHours[i]);
        }
    }
}