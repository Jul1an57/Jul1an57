import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        int data;
        int sum =0;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Enter an integer(the input ends if it is 0):");
            data = sc.nextInt();
            sum+=data;
        }while(data!=0);
        System.out.print("the sum is"+sum);
    }
}
