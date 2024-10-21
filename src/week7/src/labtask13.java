import java.util.Scanner;
public class labtask13 {

    private static int hexCharToDecimal(char hexChar) {
        switch (hexChar) {
            case '0': return 0;
            case '1': return 1;
            case '2': return 2;
            case '3': return 3;
            case '4': return 4;
            case '5': return 5;
            case '6': return 6;
            case '7': return 7;
            case '8': return 8;
            case '9': return 9;
            case 'A': case 'a': return 10;
            case 'B': case 'b': return 11;
            case 'C': case 'c': return 12;
            case 'D': case 'd': return 13;
            case 'E': case 'e': return 14;
            case 'F': case 'f': return 15;
            default: throw new IllegalArgumentException("Invalid hex character: " + hexChar);
        }
    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String hexString = scanner.nextLine();


        int decimalValueCustom = 0;
        for (int i = 0; i < hexString.length(); i++) {
            decimalValueCustom = decimalValueCustom * 16 + hexCharToDecimal(hexString.charAt(i));
        }
        System.out.println("Using custom method: " + decimalValueCustom);

    }
}
