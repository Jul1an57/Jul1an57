import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        int n = (int)(System.currentTimeMillis()%10);
        int m = (int)(System.currentTimeMillis()/10%10);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is "+n+"+"+m+"?");
        int i = sc.nextInt();
        System.out.println(n+"+"+m+"+="+i+"is"+(n+m==i));
    }
}
