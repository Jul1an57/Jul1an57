import java.util.Scanner;

public class Lab2Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number");
        int day = sc.nextInt();
        switch(day){
            case 1:
            case 2 :
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");break;
            case 6:
            case 0:
                System.out.println("Weekend");break;
        }
    }
}
