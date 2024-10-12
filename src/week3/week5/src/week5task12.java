

import java.util.Scanner;

public class week5task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three strings separated by spaces: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("The strings are: " + s1 + ", " + s2 + ", " + s3);
        input.close();
    }
}
