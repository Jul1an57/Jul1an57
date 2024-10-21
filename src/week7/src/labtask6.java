public class labtask6 {
    public static void main(String[] args) {
        int x =1;
        System.out.println("Before the call , x is "+x);
        increment(x);
        System.out.println("Before the call ,x is "+x);
    }

    private static void increment(int x) {
        x++;
        System.out.println("x inside the method is "+ x);
    }
}
