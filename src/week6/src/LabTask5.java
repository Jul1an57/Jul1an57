import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (the input ends if it is 0):");
        int data = sc.nextInt();
        int sum =0;
        while(data!=0){
            sum+=data;
            System.out.print("Enter an integer (the input ends if it is 0):");
            data=sc.nextInt();
        }
        System.out.println("The sun is"+sum);
    }
}
