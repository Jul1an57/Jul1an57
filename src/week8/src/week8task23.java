import java.util.Scanner;

public class week8task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("The numbers in reverse order are :");
        for (int i = nums.length-1; i >=0 ; i++) {
            System.out.println(nums[i]+" ");
        }
    }
}
