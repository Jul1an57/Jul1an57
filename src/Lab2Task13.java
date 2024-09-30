import java.util.Scanner;

public class Lab2Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m>90){
            double n  =  (m*(1+0.03));
        }else {
            double e = m*(1+0.01);
        }

    }
}
