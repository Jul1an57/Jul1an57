

import java.util.Scanner;

public class week5task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        String[] cities = {city1, city2, city3};
        java.util.Arrays.sort(cities);

        System.out.println("Cities in ascending order:");
        for (String city : cities) {
            System.out.println(city);
        }

        input.close();
    }
}
