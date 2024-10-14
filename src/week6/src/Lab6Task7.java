import java.util.Random;

public class Lab6Task7 {
    public static void main(String[] args) {
        int sum = 0;
        Random r = new Random();
        int j  = r.nextInt(10);

        for (int i = 0; i < 10; i++) {
            sum+=i;
            while (j<10){
                if(i<j){
                    System.out.println(j);
                }
                else {
                    System.out.println(i);
                }
                j++;
            }
        }

    }
}
