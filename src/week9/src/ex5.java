import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        Random  geberator1 = new Random();
        System.out.print("From generator1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(geberator1.nextInt(1000)+" ");
        }
        Random generator2 = new Random();
        System.out.print("\nFrom generator2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(generator2.nextInt(1000)+" ");
        }
    }
}
