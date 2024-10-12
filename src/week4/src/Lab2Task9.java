public class Lab2Task9 {
    public static void main(String[] args) {
        double monthlySaving =100;
        double monthlyIntereRate = 0.00417;
        double accountValue =0;
        for (int i = 1; i <=6 ; i++) {
            accountValue=(accountValue+monthlySaving) *(1+monthlyIntereRate);
        }
        System.out.println(accountValue);

    }
}
