import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int seconds = sc.nextInt();
        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        System.out.println(minutes+"分");
        System.out.println(remainingSeconds+"秒");
    }
}
