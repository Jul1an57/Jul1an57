public class week8task16 {
    public static void main(String[] args) {
        int x=1;
        int[] y = new int[10];
        System.out.println("Value of x before "+x);
        System.out.println("Value of y[0] befor"+y[0]);
        text(x,y);
        System.out.println("Value of x after:"+x);
        System.out.println("Value of y[0] after"+y[0]);
    }

    private static void text(int x, int[] y) {
        x=2;
        y[0] =5;
    }
}
