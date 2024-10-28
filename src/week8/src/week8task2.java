import java.util.Scanner;

public class week8task2 {
    public static void main(String[] args) {
        double[] mylist = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+mylist.length+" Values");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] =sc.nextDouble();
        }
        sc.close();
    }
}
