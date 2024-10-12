import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i%2==0&&i%3==0){
            System.out.println(i+"is divisible by 2 and 3");
        }
        if(i%2==0||i%3==0){
            System.out.println(i+"is divisible by 2 or 3");
        }
        if(i%2==0^i%3==0){
            System.out.println(i+"is divisible 2 or 3,but not both");
        }
    }
}
