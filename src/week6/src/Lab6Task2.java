import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        int n1 = (int)(Math.random()*10);
        int n2 = (int)(Math.random()*10);

        Scanner input = new Scanner(System.in);
        System.out.print("what is "+n1+"+"+n2+"?");
        int m = input.nextInt();
        while(n1+n2!=m){
            System.out.println("wrong answer . try again.what is answer = input.nextint()");
        }
        System.out.println("you got it");
    }
}
