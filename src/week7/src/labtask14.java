import java.util.Scanner;
public class labtask14 {
    public static int gcd(int a,int b){
        while(b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer");
        int num1 = scanner.nextInt();
        System.out.println("Enter second integer");
        int num2 =scanner.nextInt();
        System.out.println("The greatest common divisor for"+num1+"and"+num2+"is"+gcd(num1,num2));
    }
}

