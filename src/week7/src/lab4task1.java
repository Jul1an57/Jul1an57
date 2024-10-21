public class lab4task1 {
    public static void main(String[] args) {

        System.out.println("Sum from 1 to 10 is" +sum(1,10));
        System.out.println("Sum from 1 to 10 is" +sum(20,30));
        System.out.println("Sum from 1 to 10 is" +sum(35,45));
    }

    private static int sum(int i, int i1) {
        int sum =0;
        for (int j = i; j <= i1; j++) {
            sum+=j;

        }
        return sum;
    }
}
